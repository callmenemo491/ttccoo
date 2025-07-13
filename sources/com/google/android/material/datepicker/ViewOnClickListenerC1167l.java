package com.google.android.material.datepicker;

/* renamed from: com.google.android.material.datepicker.l */
/* loaded from: classes.dex */
public class ViewOnClickListenerC1167l implements android.view.View.OnClickListener {

    /* renamed from: Y */
    public final /* synthetic */ com.google.android.material.datepicker.C1176u f6094Y;

    /* renamed from: Z */
    public final /* synthetic */ com.google.android.material.datepicker.C1161f f6095Z;

    public ViewOnClickListenerC1167l(com.google.android.material.datepicker.C1161f r1, com.google.android.material.datepicker.C1176u r2) {
            r0 = this;
            r0.f6095Z = r1
            r0.f6094Y = r2
            r0.<init>()
            return
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View r3) {
            r2 = this;
            com.google.android.material.datepicker.f r3 = r2.f6095Z
            androidx.recyclerview.widget.LinearLayoutManager r3 = r3.m3413E0()
            int r3 = r3.m1675Y0()
            int r3 = r3 + (-1)
            if (r3 < 0) goto L19
            com.google.android.material.datepicker.f r0 = r2.f6095Z
            com.google.android.material.datepicker.u r1 = r2.f6094Y
            com.google.android.material.datepicker.r r3 = r1.m3438i(r3)
            r0.m3415G0(r3)
        L19:
            return
    }
}
