package com.google.android.material.datepicker;

/* renamed from: com.google.android.material.datepicker.k */
/* loaded from: classes.dex */
public class ViewOnClickListenerC1166k implements android.view.View.OnClickListener {

    /* renamed from: Y */
    public final /* synthetic */ com.google.android.material.datepicker.C1176u f6092Y;

    /* renamed from: Z */
    public final /* synthetic */ com.google.android.material.datepicker.C1161f f6093Z;

    public ViewOnClickListenerC1166k(com.google.android.material.datepicker.C1161f r1, com.google.android.material.datepicker.C1176u r2) {
            r0 = this;
            r0.f6093Z = r1
            r0.f6092Y = r2
            r0.<init>()
            return
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View r3) {
            r2 = this;
            com.google.android.material.datepicker.f r3 = r2.f6093Z
            androidx.recyclerview.widget.LinearLayoutManager r3 = r3.m3413E0()
            int r3 = r3.m1674X0()
            int r3 = r3 + 1
            com.google.android.material.datepicker.f r0 = r2.f6093Z
            androidx.recyclerview.widget.RecyclerView r0 = r0.f6076c1
            androidx.recyclerview.widget.RecyclerView$e r0 = r0.getAdapter()
            int r0 = r0.mo1521b()
            if (r3 >= r0) goto L25
            com.google.android.material.datepicker.f r0 = r2.f6093Z
            com.google.android.material.datepicker.u r1 = r2.f6092Y
            com.google.android.material.datepicker.r r3 = r1.m3438i(r3)
            r0.m3415G0(r3)
        L25:
            return
    }
}
