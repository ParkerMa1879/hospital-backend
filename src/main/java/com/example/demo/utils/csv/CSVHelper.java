//package com.example.demo.utils.csv;
//
//import java.io.*;
//import java.util.Arrays;
//import java.util.List;
//
//import com.example.demo.index.BasicInfo;
//import org.apache.commons.csv.*;
//
//public class CSVHelper {
//  public static ByteArrayInputStream basicInfosToCSV(List<BasicInfo> basicInfos) {
//    final CSVFormat format = CSVFormat.DEFAULT.withQuoteMode(QuoteMode.MINIMAL);
//
//    try (ByteArrayOutputStream out = new ByteArrayOutputStream();
//        CSVPrinter csvPrinter = new CSVPrinter(new PrintWriter(out), format);) {
//      for (BasicInfo basicInfo : basicInfos) {
//        List<String> data = Arrays.asList(
//                String.valueOf(basicInfo.getId()),
//                String.valueOf(basicInfo.getName()),
//                String.valueOf(basicInfo.getAge()),
//                String.valueOf(basicInfo.getIdentification()),
//                String.valueOf(basicInfo.getGender()),
//                String.valueOf(basicInfo.getDate()),
//                String.valueOf(basicInfo.getNamePinyin()),
//                String.valueOf(basicInfo.getMrRaw()),
//                String.valueOf(basicInfo.getMrSort()),
//                String.valueOf(basicInfo.getMrDate()),
//                String.valueOf(basicInfo.getRemarkForFollowupVisit()),
//                String.valueOf(basicInfo.getCsvdNum()),
//                String.valueOf(basicInfo.getPrimDiag()),
//                String.valueOf(basicInfo.getFollowupYear()),
//                String.valueOf(basicInfo.getDropOut()),
//                String.valueOf(basicInfo.getHospitalNum()),
//                String.valueOf(basicInfo.getBedNum()),
//                String.valueOf(basicInfo.getClinicNum()),
//                String.valueOf(basicInfo.getBirthDate()),
//                String.valueOf(basicInfo.geteThnic()),
//                String.valueOf(basicInfo.getEduLevel()),
//                String.valueOf(basicInfo.getEduYear()),
//                String.valueOf(basicInfo.getProfession()),
//                String.valueOf(basicInfo.getWork()),
//                String.valueOf(basicInfo.getAddress()),
//                String.valueOf(basicInfo.getContact()),
//                String.valueOf(basicInfo.getSpecimenRemark()),
//                String.valueOf(basicInfo.getBlood()),
//                String.valueOf(basicInfo.getBloodbox()),
//                String.valueOf(basicInfo.getBloodSampleNum()),
//                String.valueOf(basicInfo.getCerebrospinalFluidNum()),
//                String.valueOf(basicInfo.getUrineNum()),
//                String.valueOf(basicInfo.getMedicalHistory()),
//                String.valueOf(basicInfo.getMemoryDeclineCourse()),
//                String.valueOf(basicInfo.getIncreasedMemoryImpairment()),
//                String.valueOf(basicInfo.getMaritalStatus()),
//                String.valueOf(basicInfo.getHeight()),
//                String.valueOf(basicInfo.getWeight()),
//                String.valueOf(basicInfo.getCerebrovascularDisease()),
//                String.valueOf(basicInfo.getCerebrovascularDiseaseYear()),
//                String.valueOf(basicInfo.getStableCerebrovascularDisease()),
//                String.valueOf(basicInfo.getCerebrovascularDiseaseMedication()),
//                String.valueOf(basicInfo.getCnsDiseaseDescription()),
//                String.valueOf(basicInfo.getHypertension()),
//                String.valueOf(basicInfo.getHypertensionYear()),
//                String.valueOf(basicInfo.getHighestHypertension()),
//                String.valueOf(basicInfo.getAverageHypertension()),
//                String.valueOf(basicInfo.getStableHypertension()),
//                String.valueOf(basicInfo.getHypertensionMedication()),
//                String.valueOf(basicInfo.getDiabetes()),
//                String.valueOf(basicInfo.getDiabetesYear()),
//                String.valueOf(basicInfo.getStableDiabetes()),
//                String.valueOf(basicInfo.getDiabetesMedication()),
//                String.valueOf(basicInfo.getCoronaryDisease()),
//                String.valueOf(basicInfo.getCoronaryDiseaseYear()),
//                String.valueOf(basicInfo.getStableCoronaryDisease()),
//                String.valueOf(basicInfo.geTatrialFibrillation()),
//                String.valueOf(basicInfo.getAtrialFibrillationYear()),
//                String.valueOf(basicInfo.getAtrialFibrillationControl()),
//                String.valueOf(basicInfo.getHyperlipidemia()),
//                String.valueOf(basicInfo.getHyperlipidemiaYear()),
//                String.valueOf(basicInfo.getStableHyperlipidemia()),
//                String.valueOf(basicInfo.getHyperlipidemiaMedication()),
//                String.valueOf(basicInfo.getMedicalRemark()),
//                String.valueOf(basicInfo.getOtherMedicine()),
//                String.valueOf(basicInfo.getSmoke()),
//                String.valueOf(basicInfo.getSmokeYear()),
//                String.valueOf(basicInfo.getSmokeNumPerDay()),
//                String.valueOf(basicInfo.getQuitSmoking()),
//                String.valueOf(basicInfo.getQuitSmokingYear()),
//                String.valueOf(basicInfo.getDrink()),
//                String.valueOf(basicInfo.getHistoryOfAlcoholism()),
//                String.valueOf(basicInfo.getAlcoholGPerDay()),
//                String.valueOf(basicInfo.getQuitDrinking()),
//                String.valueOf(basicInfo.getQuitDrinkingYear()),
//                String.valueOf(basicInfo.getFamilyHistory()),
//                String.valueOf(basicInfo.getFamilyHistoryDiscription())
//            );
//
//        csvPrinter.printRecord(data);
//      }
//
//      csvPrinter.flush();
//      return new ByteArrayInputStream(out.toByteArray());
//    } catch (IOException e) {
//      throw new RuntimeException("fail to import data to CSV file: " + e.getMessage());
//    }
//  }
//}
