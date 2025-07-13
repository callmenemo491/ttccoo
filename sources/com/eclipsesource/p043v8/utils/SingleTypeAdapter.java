package com.eclipsesource.p043v8.utils;

/* loaded from: classes.dex */
public abstract class SingleTypeAdapter implements com.eclipsesource.p043v8.utils.TypeAdapter {
    private int typeToAdapt;

    public SingleTypeAdapter(int r1) {
            r0 = this;
            r0.<init>()
            r0.typeToAdapt = r1
            return
    }

    @Override // com.eclipsesource.p043v8.utils.TypeAdapter
    public java.lang.Object adapt(int r2, java.lang.Object r3) {
            r1 = this;
            int r0 = r1.typeToAdapt
            if (r2 != r0) goto L9
            java.lang.Object r2 = r1.adapt(r3)
            return r2
        L9:
            java.lang.Object r2 = com.eclipsesource.p043v8.utils.TypeAdapter.DEFAULT
            return r2
    }

    public abstract java.lang.Object adapt(java.lang.Object r1);
}
