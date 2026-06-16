package com.daaw;

/* JADX INFO: loaded from: classes.dex */
public class yl5 implements ag2 {
    public static String c = "Value";
    public String a = "u_value";
    public lh3 b = lh3.a(1.0f);

    @Override // com.daaw.oe2
    public void a(wt0 wt0Var) {
        this.a = wt0Var.x("name", this.a);
        this.b = wt0Var.t("value", this.b);
    }

    @Override // com.daaw.ag2
    public String n() {
        return this.a;
    }

    @Override // com.daaw.ag2
    public Object o() {
        return this.b;
    }

    @Override // com.daaw.oe2
    public void q(wt0 wt0Var) {
        wt0Var.k0("name", this.a, "misc");
        wt0Var.b0("value", this.b, "misc", 0.0f, 2.0f);
    }
}
