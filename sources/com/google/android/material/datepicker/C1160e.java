package com.google.android.material.datepicker;

/* renamed from: com.google.android.material.datepicker.e */
/* loaded from: classes.dex */
public class C1160e extends android.widget.BaseAdapter {

    /* renamed from: b0 */
    public static final int f6064b0 = 0;

    /* renamed from: Y */
    public final java.util.Calendar f6065Y;

    /* renamed from: Z */
    public final int f6066Z;

    /* renamed from: a0 */
    public final int f6067a0;

    static {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto L8
            r0 = 4
            goto L9
        L8:
            r0 = 1
        L9:
            com.google.android.material.datepicker.C1160e.f6064b0 = r0
            return
    }

    public C1160e() {
            r2 = this;
            r2.<init>()
            java.util.Calendar r0 = com.google.android.material.datepicker.C1181z.m3444e()
            r2.f6065Y = r0
            r1 = 7
            int r1 = r0.getMaximum(r1)
            r2.f6066Z = r1
            int r0 = r0.getFirstDayOfWeek()
            r2.f6067a0 = r0
            return
    }

    @Override // android.widget.Adapter
    public int getCount() {
            r1 = this;
            int r0 = r1.f6066Z
            return r0
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int r3) {
            r2 = this;
            int r0 = r2.f6066Z
            if (r3 < r0) goto L6
            r3 = 0
            goto L10
        L6:
            int r1 = r2.f6067a0
            int r3 = r3 + r1
            if (r3 <= r0) goto Lc
            int r3 = r3 - r0
        Lc:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
        L10:
            return r3
    }

    @Override // android.widget.Adapter
    public long getItemId(int r3) {
            r2 = this;
            r0 = 0
            return r0
    }

    @Override // android.widget.Adapter
    @android.annotation.SuppressLint({"WrongConstant"})
    public android.view.View getView(int r6, android.view.View r7, android.view.ViewGroup r8) {
            r5 = this;
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1 = 0
            if (r7 != 0) goto L18
            android.content.Context r7 = r8.getContext()
            android.view.LayoutInflater r7 = android.view.LayoutInflater.from(r7)
            r0 = 2131558528(0x7f0d0080, float:1.8742374E38)
            android.view.View r7 = r7.inflate(r0, r8, r1)
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
        L18:
            java.util.Calendar r7 = r5.f6065Y
            int r2 = r5.f6067a0
            int r6 = r6 + r2
            int r2 = r5.f6066Z
            if (r6 <= r2) goto L22
            int r6 = r6 - r2
        L22:
            r2 = 7
            r7.set(r2, r6)
            android.content.res.Resources r6 = r0.getResources()
            android.content.res.Configuration r6 = r6.getConfiguration()
            java.util.Locale r6 = r6.locale
            java.util.Calendar r7 = r5.f6065Y
            int r3 = com.google.android.material.datepicker.C1160e.f6064b0
            java.lang.String r6 = r7.getDisplayName(r2, r3, r6)
            r0.setText(r6)
            android.content.Context r6 = r8.getContext()
            r7 = 2131951915(0x7f13012b, float:1.9540258E38)
            java.lang.String r6 = r6.getString(r7)
            r7 = 1
            java.lang.Object[] r7 = new java.lang.Object[r7]
            java.util.Calendar r8 = r5.f6065Y
            r3 = 2
            java.util.Locale r4 = java.util.Locale.getDefault()
            java.lang.String r8 = r8.getDisplayName(r2, r3, r4)
            r7[r1] = r8
            java.lang.String r6 = java.lang.String.format(r6, r7)
            r0.setContentDescription(r6)
            return r0
    }
}
