package com.google.android.material.datepicker;

/* renamed from: com.google.android.material.datepicker.a0 */
/* loaded from: classes.dex */
public class ViewOnClickListenerC1155a0 implements android.view.View.OnClickListener {

    /* renamed from: Y */
    public final /* synthetic */ int f6053Y;

    /* renamed from: Z */
    public final /* synthetic */ com.google.android.material.datepicker.C1157b0 f6054Z;

    public ViewOnClickListenerC1155a0(com.google.android.material.datepicker.C1157b0 r1, int r2) {
            r0 = this;
            r0.f6054Z = r1
            r0.f6053Y = r2
            r0.<init>()
            return
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View r3) {
            r2 = this;
            int r3 = r2.f6053Y
            com.google.android.material.datepicker.b0 r0 = r2.f6054Z
            com.google.android.material.datepicker.f<?> r0 = r0.f6061d
            com.google.android.material.datepicker.r r0 = r0.f6072Y0
            int r0 = r0.f6123Z
            com.google.android.material.datepicker.r r3 = com.google.android.material.datepicker.C1173r.m3425g(r3, r0)
            com.google.android.material.datepicker.b0 r0 = r2.f6054Z
            com.google.android.material.datepicker.f<?> r0 = r0.f6061d
            com.google.android.material.datepicker.a r0 = r0.f6071X0
            com.google.android.material.datepicker.r r1 = r0.f6041Y
            int r1 = r3.m3427e(r1)
            if (r1 >= 0) goto L1f
            com.google.android.material.datepicker.r r3 = r0.f6041Y
            goto L29
        L1f:
            com.google.android.material.datepicker.r r1 = r0.f6042Z
            int r1 = r3.m3427e(r1)
            if (r1 <= 0) goto L29
            com.google.android.material.datepicker.r r3 = r0.f6042Z
        L29:
            com.google.android.material.datepicker.b0 r0 = r2.f6054Z
            com.google.android.material.datepicker.f<?> r0 = r0.f6061d
            r0.m3415G0(r3)
            com.google.android.material.datepicker.b0 r3 = r2.f6054Z
            com.google.android.material.datepicker.f<?> r3 = r3.f6061d
            r0 = 1
            r3.m3416H0(r0)
            return
    }
}
