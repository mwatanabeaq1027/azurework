package bean;

import javax.faces.bean.ManagedBean;

// 「@ManagedBean」というアノテーションにより、
// このPOJOがマネージドBeanであることをアプリケーション・サーバに伝える
@ManagedBean
public class STestPageBean {

  private String display = "アクション前";

  public String display() {
    return display;
  }
}
