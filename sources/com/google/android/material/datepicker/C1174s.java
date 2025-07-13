package com.google.android.material.datepicker;

/* renamed from: com.google.android.material.datepicker.s */
/* loaded from: classes.dex */
public class C1174s extends android.widget.BaseAdapter {

    /* renamed from: d0 */
    public static final int f6129d0 = 0;

    /* renamed from: Y */
    public final com.google.android.material.datepicker.C1173r f6130Y;

    /* renamed from: Z */
    public final com.google.android.material.datepicker.InterfaceC1158c<?> f6131Z;

    /* renamed from: a0 */
    public java.util.Collection<java.lang.Long> f6132a0;

    /* renamed from: b0 */
    public p124h7.C2609ef f6133b0;

    /* renamed from: c0 */
    public final com.google.android.material.datepicker.C1154a f6134c0;

    static {
            java.util.Calendar r0 = com.google.android.material.datepicker.C1181z.m3444e()
            r1 = 4
            int r0 = r0.getMaximum(r1)
            com.google.android.material.datepicker.C1174s.f6129d0 = r0
            return
    }

    public C1174s(com.google.android.material.datepicker.C1173r r1, com.google.android.material.datepicker.InterfaceC1158c<?> r2, com.google.android.material.datepicker.C1154a r3) {
            r0 = this;
            r0.<init>()
            r0.f6130Y = r1
            r0.f6131Z = r2
            r0.f6134c0 = r3
            java.util.Collection r1 = r2.m3405E()
            r0.f6132a0 = r1
            return
    }

    /* renamed from: a */
    public int m3432a(int r2) {
            r1 = this;
            int r2 = r2 + (-1)
            int r0 = r1.m3433b()
            int r0 = r0 + r2
            return r0
    }

    /* renamed from: b */
    public int m3433b() {
            r1 = this;
            com.google.android.material.datepicker.r r0 = r1.f6130Y
            int r0 = r0.m3428k()
            return r0
    }

    /* renamed from: c */
    public java.lang.Long m3434c(int r3) {
            r2 = this;
            com.google.android.material.datepicker.r r0 = r2.f6130Y
            int r0 = r0.m3428k()
            if (r3 < r0) goto L2b
            int r0 = r2.m3435d()
            if (r3 <= r0) goto Lf
            goto L2b
        Lf:
            com.google.android.material.datepicker.r r0 = r2.f6130Y
            int r1 = r0.m3428k()
            int r3 = r3 - r1
            int r3 = r3 + 1
            java.util.Calendar r0 = r0.f6122Y
            java.util.Calendar r0 = com.google.android.material.datepicker.C1181z.m3441b(r0)
            r1 = 5
            r0.set(r1, r3)
            long r0 = r0.getTimeInMillis()
            java.lang.Long r3 = java.lang.Long.valueOf(r0)
            return r3
        L2b:
            r3 = 0
            return r3
    }

    /* renamed from: d */
    public int m3435d() {
            r2 = this;
            com.google.android.material.datepicker.r r0 = r2.f6130Y
            int r0 = r0.m3428k()
            com.google.android.material.datepicker.r r1 = r2.f6130Y
            int r1 = r1.f6126c0
            int r0 = r0 + r1
            int r0 = r0 + (-1)
            return r0
    }

    /* renamed from: e */
    public final void m3436e(android.widget.TextView r9, long r10) {
            r8 = this;
            if (r9 != 0) goto L3
            return
        L3:
            com.google.android.material.datepicker.a r0 = r8.f6134c0
            com.google.android.material.datepicker.a$c r0 = r0.f6043a0
            boolean r0 = r0.mo3400A(r10)
            r1 = 0
            if (r0 == 0) goto L54
            r0 = 1
            r9.setEnabled(r0)
            com.google.android.material.datepicker.c<?> r2 = r8.f6131Z
            java.util.Collection r2 = r2.m3405E()
            java.util.Iterator r2 = r2.iterator()
        L1c:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L39
            java.lang.Object r3 = r2.next()
            java.lang.Long r3 = (java.lang.Long) r3
            long r3 = r3.longValue()
            long r5 = com.google.android.material.datepicker.C1181z.m3440a(r10)
            long r3 = com.google.android.material.datepicker.C1181z.m3440a(r3)
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 != 0) goto L1c
            r1 = 1
        L39:
            if (r1 == 0) goto L40
            h7.ef r10 = r8.f6133b0
            java.lang.Object r10 = r10.f11492Z
            goto L5b
        L40:
            java.util.Calendar r0 = com.google.android.material.datepicker.C1181z.m3443d()
            long r0 = r0.getTimeInMillis()
            int r2 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            h7.ef r10 = r8.f6133b0
            if (r2 != 0) goto L51
            java.lang.Object r10 = r10.f11493a0
            goto L5b
        L51:
            java.lang.Object r10 = r10.f11491Y
            goto L5b
        L54:
            r9.setEnabled(r1)
            h7.ef r10 = r8.f6133b0
            java.lang.Object r10 = r10.f11497e0
        L5b:
            com.google.android.material.datepicker.b r10 = (com.google.android.material.datepicker.C1156b) r10
            r10.m3402b(r9)
            return
    }

    /* renamed from: f */
    public final void m3437f(com.google.android.material.datepicker.MaterialCalendarGridView r3, long r4) {
            r2 = this;
            com.google.android.material.datepicker.r r0 = com.google.android.material.datepicker.C1173r.m3426h(r4)
            com.google.android.material.datepicker.r r1 = r2.f6130Y
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L32
            com.google.android.material.datepicker.r r0 = r2.f6130Y
            java.util.Calendar r0 = r0.f6122Y
            java.util.Calendar r0 = com.google.android.material.datepicker.C1181z.m3441b(r0)
            r0.setTimeInMillis(r4)
            r1 = 5
            int r0 = r0.get(r1)
            com.google.android.material.datepicker.s r1 = r3.m3399a()
            int r0 = r1.m3432a(r0)
            int r1 = r3.getFirstVisiblePosition()
            int r0 = r0 - r1
            android.view.View r3 = r3.getChildAt(r0)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r2.m3436e(r3, r4)
        L32:
            return
    }

    @Override // android.widget.Adapter
    public int getCount() {
            r2 = this;
            com.google.android.material.datepicker.r r0 = r2.f6130Y
            int r0 = r0.f6126c0
            int r1 = r2.m3433b()
            int r1 = r1 + r0
            return r1
    }

    @Override // android.widget.Adapter
    public /* bridge */ /* synthetic */ java.lang.Object getItem(int r1) {
            r0 = this;
            java.lang.Long r1 = r0.m3434c(r1)
            return r1
    }

    @Override // android.widget.Adapter
    public long getItemId(int r3) {
            r2 = this;
            com.google.android.material.datepicker.r r0 = r2.f6130Y
            int r0 = r0.f6125b0
            int r3 = r3 / r0
            long r0 = (long) r3
            return r0
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int r9, android.view.View r10, android.view.ViewGroup r11) {
            r8 = this;
            android.content.Context r0 = r11.getContext()
            h7.ef r1 = r8.f6133b0
            if (r1 != 0) goto Lf
            h7.ef r1 = new h7.ef
            r1.<init>(r0)
            r8.f6133b0 = r1
        Lf:
            r0 = r10
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1 = 0
            if (r10 != 0) goto L27
            android.content.Context r10 = r11.getContext()
            android.view.LayoutInflater r10 = android.view.LayoutInflater.from(r10)
            r0 = 2131558527(0x7f0d007f, float:1.8742372E38)
            android.view.View r10 = r10.inflate(r0, r11, r1)
            r0 = r10
            android.widget.TextView r0 = (android.widget.TextView) r0
        L27:
            int r10 = r8.m3433b()
            int r10 = r9 - r10
            if (r10 < 0) goto L107
            com.google.android.material.datepicker.r r11 = r8.f6130Y
            int r2 = r11.f6126c0
            if (r10 < r2) goto L37
            goto L107
        L37:
            r2 = 1
            int r10 = r10 + r2
            r0.setTag(r11)
            android.content.res.Resources r11 = r0.getResources()
            android.content.res.Configuration r11 = r11.getConfiguration()
            java.util.Locale r11 = r11.locale
            java.lang.Object[] r3 = new java.lang.Object[r2]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r10)
            r3[r1] = r4
            java.lang.String r4 = "%d"
            java.lang.String r11 = java.lang.String.format(r11, r4, r3)
            r0.setText(r11)
            com.google.android.material.datepicker.r r11 = r8.f6130Y
            java.util.Calendar r11 = r11.f6122Y
            java.util.Calendar r11 = com.google.android.material.datepicker.C1181z.m3441b(r11)
            r3 = 5
            r11.set(r3, r10)
            long r10 = r11.getTimeInMillis()
            com.google.android.material.datepicker.r r4 = r8.f6130Y
            int r4 = r4.f6124a0
            java.util.Calendar r5 = com.google.android.material.datepicker.C1181z.m3443d()
            r5.set(r3, r2)
            java.util.Calendar r5 = com.google.android.material.datepicker.C1181z.m3441b(r5)
            r6 = 2
            r5.get(r6)
            int r6 = r5.get(r2)
            r7 = 7
            r5.getMaximum(r7)
            r5.getActualMaximum(r3)
            r5.getTimeInMillis()
            java.lang.String r3 = "UTC"
            r5 = 24
            if (r4 != r6) goto Lc6
            java.util.Locale r4 = java.util.Locale.getDefault()
            int r6 = android.os.Build.VERSION.SDK_INT
            if (r6 < r5) goto Laf
            java.util.concurrent.atomic.AtomicReference<com.google.android.material.datepicker.y> r5 = com.google.android.material.datepicker.C1181z.f6148a
            java.lang.String r5 = "MMMEd"
            android.icu.text.DateFormat r4 = android.icu.text.DateFormat.getInstanceForSkeleton(r5, r4)
            android.icu.util.TimeZone r3 = android.icu.util.TimeZone.getTimeZone(r3)
            r4.setTimeZone(r3)
            java.util.Date r3 = new java.util.Date
            r3.<init>(r10)
            java.lang.String r10 = r4.format(r3)
            goto Lfd
        Laf:
            java.util.concurrent.atomic.AtomicReference<com.google.android.material.datepicker.y> r3 = com.google.android.material.datepicker.C1181z.f6148a
            java.text.DateFormat r3 = java.text.DateFormat.getDateInstance(r1, r4)
            java.util.TimeZone r4 = com.google.android.material.datepicker.C1181z.m3442c()
            r3.setTimeZone(r4)
            java.util.Date r4 = new java.util.Date
            r4.<init>(r10)
            java.lang.String r10 = r3.format(r4)
            goto Lfd
        Lc6:
            java.util.Locale r4 = java.util.Locale.getDefault()
            int r6 = android.os.Build.VERSION.SDK_INT
            if (r6 < r5) goto Le7
            java.util.concurrent.atomic.AtomicReference<com.google.android.material.datepicker.y> r5 = com.google.android.material.datepicker.C1181z.f6148a
            java.lang.String r5 = "yMMMEd"
            android.icu.text.DateFormat r4 = android.icu.text.DateFormat.getInstanceForSkeleton(r5, r4)
            android.icu.util.TimeZone r3 = android.icu.util.TimeZone.getTimeZone(r3)
            r4.setTimeZone(r3)
            java.util.Date r3 = new java.util.Date
            r3.<init>(r10)
            java.lang.String r10 = r4.format(r3)
            goto Lfd
        Le7:
            java.util.concurrent.atomic.AtomicReference<com.google.android.material.datepicker.y> r3 = com.google.android.material.datepicker.C1181z.f6148a
            java.text.DateFormat r3 = java.text.DateFormat.getDateInstance(r1, r4)
            java.util.TimeZone r4 = com.google.android.material.datepicker.C1181z.m3442c()
            r3.setTimeZone(r4)
            java.util.Date r4 = new java.util.Date
            r4.<init>(r10)
            java.lang.String r10 = r3.format(r4)
        Lfd:
            r0.setContentDescription(r10)
            r0.setVisibility(r1)
            r0.setEnabled(r2)
            goto L10f
        L107:
            r10 = 8
            r0.setVisibility(r10)
            r0.setEnabled(r1)
        L10f:
            java.lang.Long r9 = r8.m3434c(r9)
            if (r9 != 0) goto L116
            goto L11d
        L116:
            long r9 = r9.longValue()
            r8.m3436e(r0, r9)
        L11d:
            return r0
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
            r1 = this;
            r0 = 1
            return r0
    }
}
