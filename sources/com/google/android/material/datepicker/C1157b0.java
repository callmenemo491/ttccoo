package com.google.android.material.datepicker;

/* renamed from: com.google.android.material.datepicker.b0 */
/* loaded from: classes.dex */
public class C1157b0 extends androidx.recyclerview.widget.RecyclerView.AbstractC0549e<com.google.android.material.datepicker.C1157b0.a> {

    /* renamed from: d */
    public final com.google.android.material.datepicker.C1161f<?> f6061d;

    /* renamed from: com.google.android.material.datepicker.b0$a */
    public static class a extends androidx.recyclerview.widget.RecyclerView.AbstractC0546b0 {

        /* renamed from: u */
        public final android.widget.TextView f6062u;

        public a(android.widget.TextView r1) {
                r0 = this;
                r0.<init>(r1)
                r0.f6062u = r1
                return
        }
    }

    public C1157b0(com.google.android.material.datepicker.C1161f<?> r1) {
            r0 = this;
            r0.<init>()
            r0.f6061d = r1
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0549e
    /* renamed from: b */
    public int mo1521b() {
            r1 = this;
            com.google.android.material.datepicker.f<?> r0 = r1.f6061d
            com.google.android.material.datepicker.a r0 = r0.f6071X0
            int r0 = r0.f6045c0
            return r0
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0549e
    /* renamed from: e */
    public void mo1523e(androidx.recyclerview.widget.RecyclerView.AbstractC0546b0 r8, int r9) {
            r7 = this;
            com.google.android.material.datepicker.b0$a r8 = (com.google.android.material.datepicker.C1157b0.a) r8
            com.google.android.material.datepicker.f<?> r0 = r7.f6061d
            com.google.android.material.datepicker.a r0 = r0.f6071X0
            com.google.android.material.datepicker.r r0 = r0.f6041Y
            int r0 = r0.f6124a0
            int r0 = r0 + r9
            android.widget.TextView r9 = r8.f6062u
            android.content.Context r9 = r9.getContext()
            r1 = 2131951920(0x7f130130, float:1.9540268E38)
            java.lang.String r9 = r9.getString(r1)
            android.widget.TextView r1 = r8.f6062u
            java.util.Locale r2 = java.util.Locale.getDefault()
            r3 = 1
            java.lang.Object[] r4 = new java.lang.Object[r3]
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
            r6 = 0
            r4[r6] = r5
            java.lang.String r5 = "%d"
            java.lang.String r2 = java.lang.String.format(r2, r5, r4)
            r1.setText(r2)
            android.widget.TextView r1 = r8.f6062u
            java.lang.Object[] r2 = new java.lang.Object[r3]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            r2[r6] = r4
            java.lang.String r9 = java.lang.String.format(r9, r2)
            r1.setContentDescription(r9)
            com.google.android.material.datepicker.f<?> r9 = r7.f6061d
            h7.ef r9 = r9.f6074a1
            java.util.Calendar r1 = com.google.android.material.datepicker.C1181z.m3443d()
            int r2 = r1.get(r3)
            if (r2 != r0) goto L53
            java.lang.Object r2 = r9.f11496d0
            goto L55
        L53:
            java.lang.Object r2 = r9.f11494b0
        L55:
            com.google.android.material.datepicker.b r2 = (com.google.android.material.datepicker.C1156b) r2
            com.google.android.material.datepicker.f<?> r4 = r7.f6061d
            com.google.android.material.datepicker.c<S> r4 = r4.f6070W0
            java.util.Collection r4 = r4.m3405E()
            java.util.Iterator r4 = r4.iterator()
        L63:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L81
            java.lang.Object r5 = r4.next()
            java.lang.Long r5 = (java.lang.Long) r5
            long r5 = r5.longValue()
            r1.setTimeInMillis(r5)
            int r5 = r1.get(r3)
            if (r5 != r0) goto L63
            java.lang.Object r2 = r9.f11495c0
            com.google.android.material.datepicker.b r2 = (com.google.android.material.datepicker.C1156b) r2
            goto L63
        L81:
            android.widget.TextView r9 = r8.f6062u
            r2.m3402b(r9)
            android.widget.TextView r8 = r8.f6062u
            com.google.android.material.datepicker.a0 r9 = new com.google.android.material.datepicker.a0
            r9.<init>(r7, r0)
            r8.setOnClickListener(r9)
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0549e
    /* renamed from: g */
    public androidx.recyclerview.widget.RecyclerView.AbstractC0546b0 mo1524g(android.view.ViewGroup r3, int r4) {
            r2 = this;
            android.content.Context r4 = r3.getContext()
            android.view.LayoutInflater r4 = android.view.LayoutInflater.from(r4)
            r0 = 2131558536(0x7f0d0088, float:1.874239E38)
            r1 = 0
            android.view.View r3 = r4.inflate(r0, r3, r1)
            android.widget.TextView r3 = (android.widget.TextView) r3
            com.google.android.material.datepicker.b0$a r4 = new com.google.android.material.datepicker.b0$a
            r4.<init>(r3)
            return r4
    }

    /* renamed from: i */
    public int m3403i(int r2) {
            r1 = this;
            com.google.android.material.datepicker.f<?> r0 = r1.f6061d
            com.google.android.material.datepicker.a r0 = r0.f6071X0
            com.google.android.material.datepicker.r r0 = r0.f6041Y
            int r0 = r0.f6124a0
            int r2 = r2 - r0
            return r2
    }
}
