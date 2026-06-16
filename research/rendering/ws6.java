package com.daaw;

import android.opengl.GLES20;

/* JADX INFO: loaded from: classes.dex */
public class ws6 extends cm5 {
    public ow0 j;

    public ws6(String str, String str2) {
        super(str, str2);
        this.j = new ow0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean C() {
        return Boolean.valueOf(this.a == 0);
    }

    public void D(int i, boolean z, float[] fArr) {
        GLES20.glUniformMatrix4fv(i, 1, z, fArr, 0);
    }

    public void E(String str, boolean z, float[] fArr) {
        D(l(str), z, fArr);
    }

    public void finalize() throws Throwable {
        super.finalize();
        this.j.a(new f22() { // from class: com.daaw.vs6
            @Override // com.daaw.f22
            public final Object a() {
                return this.a.C();
            }
        });
    }
}
