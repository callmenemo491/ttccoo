package com.google.android.material.datepicker;

/* renamed from: com.google.android.material.datepicker.g */
/* loaded from: classes.dex */
public class C1162g extends androidx.recyclerview.widget.RecyclerView.AbstractC0556l {

    /* renamed from: a */
    public final java.util.Calendar f6084a;

    /* renamed from: b */
    public final java.util.Calendar f6085b;

    /* renamed from: c */
    public final /* synthetic */ com.google.android.material.datepicker.C1161f f6086c;

    public C1162g(com.google.android.material.datepicker.C1161f r1) {
            r0 = this;
            r0.f6086c = r1
            r0.<init>()
            java.util.Calendar r1 = com.google.android.material.datepicker.C1181z.m3444e()
            r0.f6084a = r1
            java.util.Calendar r1 = com.google.android.material.datepicker.C1181z.m3444e()
            r0.f6085b = r1
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0556l
    /* renamed from: g */
    public void mo1840g(android.graphics.Canvas r21, androidx.recyclerview.widget.RecyclerView r22, androidx.recyclerview.widget.RecyclerView.C0569y r23) {
            r20 = this;
            r0 = r20
            androidx.recyclerview.widget.RecyclerView$e r1 = r22.getAdapter()
            boolean r1 = r1 instanceof com.google.android.material.datepicker.C1157b0
            if (r1 == 0) goto Le7
            androidx.recyclerview.widget.RecyclerView$m r1 = r22.getLayoutManager()
            boolean r1 = r1 instanceof androidx.recyclerview.widget.GridLayoutManager
            if (r1 != 0) goto L14
            goto Le7
        L14:
            androidx.recyclerview.widget.RecyclerView$e r1 = r22.getAdapter()
            com.google.android.material.datepicker.b0 r1 = (com.google.android.material.datepicker.C1157b0) r1
            androidx.recyclerview.widget.RecyclerView$m r2 = r22.getLayoutManager()
            androidx.recyclerview.widget.GridLayoutManager r2 = (androidx.recyclerview.widget.GridLayoutManager) r2
            com.google.android.material.datepicker.f r3 = r0.f6086c
            com.google.android.material.datepicker.c<S> r3 = r3.f6070W0
            java.util.Collection r3 = r3.m3411z()
            java.util.Iterator r3 = r3.iterator()
        L2c:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto Le7
            java.lang.Object r4 = r3.next()
            m0.b r4 = (p212m0.C4312b) r4
            F r5 = r4.f17582a
            if (r5 == 0) goto L2c
            S r6 = r4.f17583b
            if (r6 != 0) goto L41
            goto L2c
        L41:
            java.util.Calendar r6 = r0.f6084a
            java.lang.Long r5 = (java.lang.Long) r5
            long r7 = r5.longValue()
            r6.setTimeInMillis(r7)
            java.util.Calendar r5 = r0.f6085b
            S r4 = r4.f17583b
            java.lang.Long r4 = (java.lang.Long) r4
            long r6 = r4.longValue()
            r5.setTimeInMillis(r6)
            java.util.Calendar r4 = r0.f6084a
            r5 = 1
            int r4 = r4.get(r5)
            int r4 = r1.m3403i(r4)
            java.util.Calendar r6 = r0.f6085b
            int r5 = r6.get(r5)
            int r5 = r1.m3403i(r5)
            android.view.View r6 = r2.mo1706u(r4)
            android.view.View r7 = r2.mo1706u(r5)
            int r8 = r2.f3066F
            int r4 = r4 / r8
            int r5 = r5 / r8
            r8 = r4
        L7b:
            if (r8 > r5) goto L2c
            int r9 = r2.f3066F
            int r9 = r9 * r8
            android.view.View r9 = r2.mo1706u(r9)
            if (r9 != 0) goto L88
            goto Le4
        L88:
            int r10 = r9.getTop()
            com.google.android.material.datepicker.f r11 = r0.f6086c
            h7.ef r11 = r11.f6074a1
            java.lang.Object r11 = r11.f11494b0
            com.google.android.material.datepicker.b r11 = (com.google.android.material.datepicker.C1156b) r11
            android.graphics.Rect r11 = r11.f6055a
            int r11 = r11.top
            int r10 = r10 + r11
            int r9 = r9.getBottom()
            com.google.android.material.datepicker.f r11 = r0.f6086c
            h7.ef r11 = r11.f6074a1
            java.lang.Object r11 = r11.f11494b0
            com.google.android.material.datepicker.b r11 = (com.google.android.material.datepicker.C1156b) r11
            android.graphics.Rect r11 = r11.f6055a
            int r11 = r11.bottom
            int r9 = r9 - r11
            if (r8 != r4) goto Lb8
            int r11 = r6.getLeft()
            int r12 = r6.getWidth()
            int r12 = r12 / 2
            int r12 = r12 + r11
            goto Lb9
        Lb8:
            r12 = 0
        Lb9:
            if (r8 != r5) goto Lc7
            int r11 = r7.getLeft()
            int r13 = r7.getWidth()
            int r13 = r13 / 2
            int r13 = r13 + r11
            goto Lcb
        Lc7:
            int r13 = r22.getWidth()
        Lcb:
            float r15 = (float) r12
            float r10 = (float) r10
            float r11 = (float) r13
            float r9 = (float) r9
            com.google.android.material.datepicker.f r12 = r0.f6086c
            h7.ef r12 = r12.f6074a1
            java.lang.Object r12 = r12.f11498f0
            r19 = r12
            android.graphics.Paint r19 = (android.graphics.Paint) r19
            r14 = r21
            r16 = r10
            r17 = r11
            r18 = r9
            r14.drawRect(r15, r16, r17, r18, r19)
        Le4:
            int r8 = r8 + 1
            goto L7b
        Le7:
            return
    }
}
