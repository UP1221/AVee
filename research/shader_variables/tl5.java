package com.daaw;

/* JADX INFO: loaded from: classes.dex */
public class tl5 implements ag2 {
    public static String c = "Checkbox";
    public boolean a = true;
    public String b = "u_value";

    @Override // com.daaw.oe2
    public void a(wt0 wt0Var) {
        this.b = wt0Var.x("name", this.b);
        this.a = wt0Var.o("value", this.a);
    }

    @Override // com.daaw.ag2
    public String n() {
        return this.b;
    }

    @Override // com.daaw.ag2
    public Object o() {
        return Boolean.valueOf(this.a);
    }

    @Override // com.daaw.oe2
    public void q(wt0 wt0Var) {
        wt0Var.k0("name", this.b, "misc");
        wt0Var.N("value", this.a, "misc");
    }
}
