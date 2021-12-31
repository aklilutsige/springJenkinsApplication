package et.aklilu.tsige.springjenkinsapplication.controller;

import et.aklilu.tsige.springjenkinsapplication.model.Member;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class HelloController {
    @GetMapping("/")
    public List<Member> getAllMembers(){
        /**
         * Test Data
         */
        Member aklilu = new Member("Aklilu", "Tsige", "30/03/1986", "M");
        Member tegest = new Member("Tegest", "Tsige", "30/03/1994", "F");
        Member tilahune = new Member("Thilahune", "Tsige", "24/03/1981", "M");
        Member enat = new Member("Enat", "Tsige", "28/03/1986", "F");
        Member neba = new Member("Neba", "Tsige", "15/03/196", "M");
        Member nebaTg = new Member("Tegest", "Tsige", "30/03/1986", "F");

        List<Member> memberList = new ArrayList<>();
        memberList.addAll(List.of(aklilu,tegest, tilahune,enat,neba,nebaTg));

        return memberList;
    }
}
