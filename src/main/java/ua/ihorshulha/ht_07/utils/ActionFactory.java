//package ua.ihorshulha.ht_07.utils;
//
//import ua.ihorshulha.ht_07.controller.AcountController;
//import ua.ihorshulha.ht_07.controller.DeveloperController;
//import ua.ihorshulha.ht_07.controller.SkillController;
//import ua.ihorshulha.ht_07.model.Skill;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//
//import static ua.ihorshulha.ht_07.utils.Validate.isCorrectInteger;
//
//public class ActionFactory {
//
//    private DeveloperController developerController;
//    private AcountController acountController;
//
//    public ActionFactory() {
//    }
//
//    public void skillFactory(BufferedReader inputKeyboard) throws IOException {
//        Menu.action(inputKeyboard);
//        String input = inputKeyboard.readLine();
//        isCorrectInteger(input);
//        int num = Integer.parseInt(input);
//
//        switch (num) {
//            case 1: {
//                SkillController skillController = new SkillController();
//                skillController.getAllSkills();
//                break;
//            }
//            case 2: {
////                skillController.getSkillById(num);
//                break;
//            }
//            case 3: {
//                SkillController skillController = new SkillController();
//                Skill skill = skillController.createSkill(inputKeyboard);
//                skillController.addSkill(skill);
//                break;
//            }
//            case 4: {
////                skillController.updateSkillById(num);
//                break;
//            }
//            case 5: {
////                skillController.removeSkillById(num);
//                break;
//            }
//            case 0: {
////                menuFactory(num, inputKeyboard, true);
//                break;
//            }
//            default: {
//                System.out.println("You entered invalid number. Repeat please.");
//            }
//        }
//    }
//}
