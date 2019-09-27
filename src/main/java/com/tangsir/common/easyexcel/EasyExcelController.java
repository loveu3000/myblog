package com.tangsir.common.easyexcel;


import com.alibaba.excel.ExcelWriter;
import com.alibaba.excel.metadata.Sheet;
import com.alibaba.excel.support.ExcelTypeEnum;
import com.alibaba.excel.util.CollectionUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Controller
public class EasyExcelController {


    public void downExcelNew(){
        ArrayList<AModel> aModels = new ArrayList<>();
        aModels.add(new AModel("黎明","1"));
        aModels.add(new AModel("张三","2"));
        ArrayList<BModel> bModels = new ArrayList<>();
        bModels.add(new BModel("一班","11"));
        bModels.add(new BModel("一班","22"));

    }


    @RequestMapping("/down")
    public void downExcel(HttpServletResponse response){
        ArrayList<AModel> aModels = new ArrayList<>();
        aModels.add(new AModel("黎明","1"));
        aModels.add(new AModel("张三","2"));
        ArrayList<BModel> bModels = new ArrayList<>();
        bModels.add(new BModel("一班","11"));
        bModels.add(new BModel("一班","22"));



        //最新版

         /*  ServletOutputStream out = null;
        try {
            out = response.getOutputStream();
            response.setContentType("application/vnd.ms-excel");
            response.setCharacterEncoding("utf-8");
            response.setHeader("Content-disposition", "attachment;filename=demo.xlsx");
            ExcelWriter excelWriter = EasyExcel.write(out).build();
            WriteSheet one = EasyExcelFactory.writerSheet().head(AModel.class).sheetName("one").build();
            WriteSheet two = .EasyExcelFactorywriterSheet().head(BModel.class).sheetName("two").build();
            excelWriter.write(aModels,one);
            excelWriter.write(bModels,two);
            excelWriter.finish();
        } catch (Exception e) {
            e.printStackTrace();
        }*/

        //旧版
        String header = "报告";
        ServletOutputStream out = null;
        response.setContentType("application/vnd.ms-excel");
        response.setCharacterEncoding("utf-8");
        response.setHeader("Content-disposition", "attachment;filename=demo.xlsx");

        List<ExcelUtil.MultipleSheelPropety> multips = new ArrayList<ExcelUtil.MultipleSheelPropety>();
        ExcelUtil.MultipleSheelPropety oneTip = new ExcelUtil.MultipleSheelPropety();
        ExcelUtil.MultipleSheelPropety twoTip = new ExcelUtil.MultipleSheelPropety();
        com.alibaba.excel.metadata.Sheet  oneSheet = new com.alibaba.excel.metadata.Sheet(1, 0);
        com.alibaba.excel.metadata.Sheet  twoSheet = new com.alibaba.excel.metadata.Sheet(2, 0);
        oneSheet.setSheetName("地市统计总览");
        oneSheet.setAutoWidth(Boolean.TRUE);
        twoSheet.setSheetName("明细信息");
        twoSheet.setAutoWidth(Boolean.TRUE);
        oneTip.setSheet(oneSheet);
        twoTip.setSheet(twoSheet);
        oneTip.setData(aModels);
        twoTip.setData(bModels);
        multips.add(oneTip);
        multips.add(twoTip);
        try {
            out = response.getOutputStream();
            ExcelWriter writer = new ExcelWriter(out, ExcelTypeEnum.XLSX);
            for (ExcelUtil.MultipleSheelPropety multipleSheelPropety : multips) {
                Sheet sheet = multipleSheelPropety.getSheet();
                if(!CollectionUtils.isEmpty(multipleSheelPropety.getData())){
                    sheet.setClazz(multipleSheelPropety.getData().get(0).getClass());
                }
                writer.write(multipleSheelPropety.getData(), sheet);
            }
            writer.finish();
            out.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
