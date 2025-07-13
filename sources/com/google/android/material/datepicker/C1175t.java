package com.google.android.material.datepicker;

/* renamed from: com.google.android.material.datepicker.t */
/* loaded from: classes.dex */
public class C1175t implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: Y */
    public final /* synthetic */ com.google.android.material.datepicker.MaterialCalendarGridView f6135Y;

    /* renamed from: Z */
    public final /* synthetic */ com.google.android.material.datepicker.C1176u f6136Z;

    public C1175t(com.google.android.material.datepicker.C1176u r1, com.google.android.material.datepicker.MaterialCalendarGridView r2) {
            r0 = this;
            r0.f6136Z = r1
            r0.f6135Y = r2
            r0.<init>()
            return
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(android.widget.AdapterView<?> r1, android.view.View r2, int r3, long r4) {
            r0 = this;
            com.google.android.material.datepicker.MaterialCalendarGridView r1 = r0.f6135Y
            com.google.android.material.datepicker.s r1 = r1.m3399a()
            int r2 = r1.m3433b()
            if (r3 < r2) goto L14
            int r1 = r1.m3435d()
            if (r3 > r1) goto L14
            r1 = 1
            goto L15
        L14:
            r1 = 0
        L15:
            if (r1 == 0) goto L7a
            com.google.android.material.datepicker.u r1 = r0.f6136Z
            com.google.android.material.datepicker.f$e r1 = r1.f6140g
            com.google.android.material.datepicker.MaterialCalendarGridView r2 = r0.f6135Y
            com.google.android.material.datepicker.s r2 = r2.m3399a()
            java.lang.Long r2 = r2.m3434c(r3)
            long r2 = r2.longValue()
            com.google.android.material.datepicker.f$d r1 = (com.google.android.material.datepicker.C1161f.d) r1
            com.google.android.material.datepicker.f r4 = r1.f6083a
            com.google.android.material.datepicker.a r4 = r4.f6071X0
            com.google.android.material.datepicker.a$c r4 = r4.f6043a0
            boolean r4 = r4.mo3400A(r2)
            if (r4 == 0) goto L7a
            com.google.android.material.datepicker.f r4 = r1.f6083a
            com.google.android.material.datepicker.c<S> r4 = r4.f6070W0
            r4.m3407P(r2)
            com.google.android.material.datepicker.f r2 = r1.f6083a
            java.util.LinkedHashSet<com.google.android.material.datepicker.v<S>> r2 = r2.f6144U0
            java.util.Iterator r2 = r2.iterator()
        L46:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L5e
            java.lang.Object r3 = r2.next()
            com.google.android.material.datepicker.v r3 = (com.google.android.material.datepicker.AbstractC1177v) r3
            com.google.android.material.datepicker.f r4 = r1.f6083a
            com.google.android.material.datepicker.c<S> r4 = r4.f6070W0
            java.lang.Object r4 = r4.m3406I()
            r3.mo3423a(r4)
            goto L46
        L5e:
            com.google.android.material.datepicker.f r2 = r1.f6083a
            androidx.recyclerview.widget.RecyclerView r2 = r2.f6076c1
            androidx.recyclerview.widget.RecyclerView$e r2 = r2.getAdapter()
            androidx.recyclerview.widget.RecyclerView$f r2 = r2.f3228a
            r2.m1813b()
            com.google.android.material.datepicker.f r1 = r1.f6083a
            androidx.recyclerview.widget.RecyclerView r1 = r1.f6075b1
            if (r1 == 0) goto L7a
            androidx.recyclerview.widget.RecyclerView$e r1 = r1.getAdapter()
            androidx.recyclerview.widget.RecyclerView$f r1 = r1.f3228a
            r1.m1813b()
        L7a:
            return
    }
}
