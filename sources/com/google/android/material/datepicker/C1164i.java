package com.google.android.material.datepicker;

/* renamed from: com.google.android.material.datepicker.i */
/* loaded from: classes.dex */
public class C1164i extends androidx.recyclerview.widget.RecyclerView.AbstractC0562r {

    /* renamed from: a */
    public final /* synthetic */ com.google.android.material.datepicker.C1176u f6088a;

    /* renamed from: b */
    public final /* synthetic */ com.google.android.material.button.MaterialButton f6089b;

    /* renamed from: c */
    public final /* synthetic */ com.google.android.material.datepicker.C1161f f6090c;

    public C1164i(com.google.android.material.datepicker.C1161f r1, com.google.android.material.datepicker.C1176u r2, com.google.android.material.button.MaterialButton r3) {
            r0 = this;
            r0.f6090c = r1
            r0.f6088a = r2
            r0.f6089b = r3
            r0.<init>()
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0562r
    /* renamed from: a */
    public void mo1905a(androidx.recyclerview.widget.RecyclerView r1, int r2) {
            r0 = this;
            if (r2 != 0) goto Lb
            com.google.android.material.button.MaterialButton r2 = r0.f6089b
            java.lang.CharSequence r2 = r2.getText()
            r1.announceForAccessibility(r2)
        Lb:
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0562r
    /* renamed from: b */
    public void mo1906b(androidx.recyclerview.widget.RecyclerView r2, int r3, int r4) {
            r1 = this;
            com.google.android.material.datepicker.f r2 = r1.f6090c
            androidx.recyclerview.widget.LinearLayoutManager r2 = r2.m3413E0()
            if (r3 >= 0) goto Ld
            int r2 = r2.m1674X0()
            goto L11
        Ld:
            int r2 = r2.m1675Y0()
        L11:
            com.google.android.material.datepicker.f r3 = r1.f6090c
            com.google.android.material.datepicker.u r4 = r1.f6088a
            com.google.android.material.datepicker.r r4 = r4.m3438i(r2)
            r3.f6072Y0 = r4
            com.google.android.material.button.MaterialButton r3 = r1.f6089b
            com.google.android.material.datepicker.u r4 = r1.f6088a
            com.google.android.material.datepicker.a r0 = r4.f6138e
            com.google.android.material.datepicker.r r0 = r0.f6041Y
            com.google.android.material.datepicker.r r2 = r0.m3430o(r2)
            android.content.Context r4 = r4.f6137d
            java.lang.String r2 = r2.m3429l(r4)
            r3.setText(r2)
            return
    }
}
