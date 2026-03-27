package com.studentdata;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Qns {
    int qnid;
    String qn;
    String op1;
    String op2;
    String op3;
    String op4;
    String ans;

    public Qns(String op1, String ans, String op2, String op3, String op4, String qn, int qnid) {
        this.op1 = op1;
        this.ans = ans;
        this.op2 = op2;
        this.op3 = op3;
        this.op4 = op4;
        this.qn = qn;
        this.qnid = qnid;
    }
    public Qns(){}

    public String getAns() {
        return ans;
    }

    public void setAns(String ans) {
        this.ans = ans;
    }

    public String getOp1() {
        return op1;
    }

    public void setOp1(String op1) {
        this.op1 = op1;
    }

    public String getOp2() {
        return op2;
    }

    public void setOp2(String op2) {
        this.op2 = op2;
    }

    public String getOp3() {
        return op3;
    }

    public void setOp3(String op3) {
        this.op3 = op3;
    }

    public String getOp4() {
        return op4;
    }

    public void setOp4(String op4) {
        this.op4 = op4;
    }

    public String getQn() {
        return qn;
    }

    public void setQn(String qn) {
        this.qn = qn;
    }

    public int getQnid() {
        return qnid;
    }

    public void setQnid(int qnid) {
        this.qnid = qnid;
    }

    public static void main(String[] args) {
        Qns q=new Qns();
       q.setQnid(131);
       q.setQn("Days in a week");
       q.setAns("7");
       q.setOp1("3");
       q.setOp2("7");
       q.setOp3("5");
       q.setOp4("11");
        ApplicationContext context=new ClassPathXmlApplicationContext("config1.xml");
        QnsDao qnsDao=context.getBean("qnsDaoimpl",QnsDao.class);
        Qns qns=new Qns("n*n","n*n","n","2n","n*n"," Worst case time complexity of the bubble sort",39);
        int r=qnsDao.insert(qns);
        List<Qns> list=qnsDao.getqn();
        Qns q1=list.get(0);
        System.out.println(q1.qn +" ans" + q1.ans);
       // int r=qnsDao.insert(q);
        System.out.println("hellllo");


    }
}
