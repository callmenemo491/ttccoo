package p171jd;

/* renamed from: jd.w */
/* loaded from: classes.dex */
public class C3567w extends p171jd.AbstractC3564v {

    /* renamed from: B */
    public static final android.util.SparseIntArray f15599B = null;

    /* renamed from: A */
    public long f15600A;

    /* renamed from: z */
    public p171jd.C3567w.a f15601z;

    /* renamed from: jd.w$a */
    public static class a implements p347u0.InterfaceC6279c {

        /* renamed from: a */
        public ve.C6654c f15602a;

        public a() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    static {
            android.util.SparseIntArray r0 = new android.util.SparseIntArray
            r0.<init>()
            p171jd.C3567w.f15599B = r0
            r1 = 2131362711(0x7f0a0397, float:1.834521E38)
            r2 = 4
            r0.put(r1, r2)
            r1 = 2131362190(0x7f0a018e, float:1.8344154E38)
            r2 = 5
            r0.put(r1, r2)
            r1 = 2131362258(0x7f0a01d2, float:1.8344292E38)
            r2 = 6
            r0.put(r1, r2)
            r1 = 2131361940(0x7f0a0094, float:1.8343647E38)
            r2 = 7
            r0.put(r1, r2)
            r1 = 2131361944(0x7f0a0098, float:1.8343655E38)
            r2 = 8
            r0.put(r1, r2)
            return
    }

    public C3567w(androidx.databinding.InterfaceC0358e r16, android.view.View r17) {
            r15 = this;
            r13 = r15
            r0 = r17
            android.util.SparseIntArray r1 = p171jd.C3567w.f15599B
            r2 = 9
            r3 = r16
            java.lang.Object[] r14 = androidx.databinding.ViewDataBinding.m1051k(r3, r0, r2, r1)
            r1 = 7
            r1 = r14[r1]
            r5 = r1
            com.google.android.material.button.MaterialButton r5 = (com.google.android.material.button.MaterialButton) r5
            r1 = 8
            r1 = r14[r1]
            r6 = r1
            com.google.android.material.button.MaterialButton r6 = (com.google.android.material.button.MaterialButton) r6
            r1 = 2
            r1 = r14[r1]
            r7 = r1
            androidx.appcompat.widget.AppCompatTextView r7 = (androidx.appcompat.widget.AppCompatTextView) r7
            r1 = 5
            r1 = r14[r1]
            r8 = r1
            androidx.appcompat.widget.LinearLayoutCompat r8 = (androidx.appcompat.widget.LinearLayoutCompat) r8
            r1 = 3
            r1 = r14[r1]
            r9 = r1
            androidx.appcompat.widget.AppCompatTextView r9 = (androidx.appcompat.widget.AppCompatTextView) r9
            r1 = 6
            r1 = r14[r1]
            r10 = r1
            com.google.android.material.imageview.ShapeableImageView r10 = (com.google.android.material.imageview.ShapeableImageView) r10
            r1 = 1
            r1 = r14[r1]
            r11 = r1
            androidx.appcompat.widget.AppCompatSeekBar r11 = (androidx.appcompat.widget.AppCompatSeekBar) r11
            r1 = 4
            r1 = r14[r1]
            r12 = r1
            androidx.appcompat.widget.AppCompatTextView r12 = (androidx.appcompat.widget.AppCompatTextView) r12
            r4 = 2
            r1 = r15
            r2 = r16
            r3 = r17
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r1 = -1
            r13.f15600A = r1
            androidx.appcompat.widget.AppCompatTextView r1 = r13.f15575t
            r2 = 0
            r1.setTag(r2)
            androidx.appcompat.widget.AppCompatTextView r1 = r13.f15576u
            r1.setTag(r2)
            r1 = 0
            r1 = r14[r1]
            androidx.constraintlayout.widget.ConstraintLayout r1 = (androidx.constraintlayout.widget.ConstraintLayout) r1
            r1.setTag(r2)
            androidx.appcompat.widget.AppCompatSeekBar r1 = r13.f15578w
            r1.setTag(r2)
            r1 = 2131362083(0x7f0a0123, float:1.8343937E38)
            r0.setTag(r1, r15)
            monitor-enter(r15)
            r0 = 8
            r13.f15600A = r0     // Catch: java.lang.Throwable -> L73
            monitor-exit(r15)     // Catch: java.lang.Throwable -> L73
            r15.m1059o()
            return
        L73:
            r0 = move-exception
            monitor-exit(r15)     // Catch: java.lang.Throwable -> L73
            throw r0
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: e */
    public void mo1054e() {
            r18 = this;
            r1 = r18
            monitor-enter(r18)
            long r2 = r1.f15600A     // Catch: java.lang.Throwable -> L94
            r4 = 0
            r1.f15600A = r4     // Catch: java.lang.Throwable -> L94
            monitor-exit(r18)     // Catch: java.lang.Throwable -> L94
            ve.c r0 = r1.f15579x
            r6 = 15
            long r6 = r6 & r2
            r8 = 14
            r10 = 12
            r12 = 13
            r14 = 0
            int r15 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r15 == 0) goto L66
            long r6 = r2 & r10
            int r15 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r15 == 0) goto L30
            if (r0 == 0) goto L30
            jd.w$a r6 = r1.f15601z
            if (r6 != 0) goto L2d
            jd.w$a r6 = new jd.w$a
            r6.<init>()
            r1.f15601z = r6
        L2d:
            r6.f15602a = r0
            goto L31
        L30:
            r6 = r14
        L31:
            long r15 = r2 & r12
            int r7 = (r15 > r4 ? 1 : (r15 == r4 ? 0 : -1))
            if (r7 == 0) goto L4a
            if (r0 == 0) goto L3c
            androidx.lifecycle.d0<java.lang.String> r7 = r0.f25883h
            goto L3d
        L3c:
            r7 = r14
        L3d:
            r15 = 0
            r1.m1061q(r15, r7)
            if (r7 == 0) goto L4a
            java.lang.Object r7 = r7.m1411d()
            java.lang.String r7 = (java.lang.String) r7
            goto L4b
        L4a:
            r7 = r14
        L4b:
            long r15 = r2 & r8
            int r17 = (r15 > r4 ? 1 : (r15 == r4 ? 0 : -1))
            if (r17 == 0) goto L64
            if (r0 == 0) goto L56
            androidx.lifecycle.d0<java.lang.String> r0 = r0.f25885j
            goto L57
        L56:
            r0 = r14
        L57:
            r15 = 1
            r1.m1061q(r15, r0)
            if (r0 == 0) goto L64
            java.lang.Object r0 = r0.m1411d()
            java.lang.String r0 = (java.lang.String) r0
            goto L69
        L64:
            r0 = r14
            goto L69
        L66:
            r0 = r14
            r6 = r0
            r7 = r6
        L69:
            long r12 = r12 & r2
            int r15 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r15 == 0) goto L73
            androidx.appcompat.widget.AppCompatTextView r12 = r1.f15575t
            p347u0.C6282f.m12909b(r12, r7)
        L73:
            long r7 = r2 & r8
            int r9 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r9 == 0) goto L7e
            androidx.appcompat.widget.AppCompatTextView r7 = r1.f15576u
            p347u0.C6282f.m12909b(r7, r0)
        L7e:
            long r2 = r2 & r10
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L93
            androidx.appcompat.widget.AppCompatSeekBar r0 = r1.f15578w
            if (r6 != 0) goto L8b
            r0.setOnSeekBarChangeListener(r14)
            goto L93
        L8b:
            u0.b r2 = new u0.b
            r2.<init>(r6, r14, r14, r14)
            r0.setOnSeekBarChangeListener(r2)
        L93:
            return
        L94:
            r0 = move-exception
            monitor-exit(r18)     // Catch: java.lang.Throwable -> L94
            throw r0
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: g */
    public boolean mo1056g() {
            r5 = this;
            monitor-enter(r5)
            long r0 = r5.f15600A     // Catch: java.lang.Throwable -> Lf
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto Lc
            r0 = 1
            monitor-exit(r5)     // Catch: java.lang.Throwable -> Lf
            return r0
        Lc:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> Lf
            r0 = 0
            return r0
        Lf:
            r0 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> Lf
            throw r0
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: l */
    public boolean mo1057l(int r5, java.lang.Object r6, int r7) {
            r4 = this;
            r0 = 0
            r1 = 1
            if (r5 == 0) goto L1a
            if (r5 == r1) goto L7
            return r0
        L7:
            androidx.lifecycle.d0 r6 = (androidx.lifecycle.C0437d0) r6
            if (r7 != 0) goto L19
            monitor-enter(r4)
            long r5 = r4.f15600A     // Catch: java.lang.Throwable -> L16
            r2 = 2
            long r5 = r5 | r2
            r4.f15600A = r5     // Catch: java.lang.Throwable -> L16
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L16
            r0 = 1
            goto L19
        L16:
            r5 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L16
            throw r5
        L19:
            return r0
        L1a:
            androidx.lifecycle.d0 r6 = (androidx.lifecycle.C0437d0) r6
            if (r7 != 0) goto L2c
            monitor-enter(r4)
            long r5 = r4.f15600A     // Catch: java.lang.Throwable -> L29
            r2 = 1
            long r5 = r5 | r2
            r4.f15600A = r5     // Catch: java.lang.Throwable -> L29
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L29
            r0 = 1
            goto L2c
        L29:
            r5 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L29
            throw r5
        L2c:
            return r0
    }

    @Override // p171jd.AbstractC3564v
    /* renamed from: r */
    public void mo8009r(ve.C6654c r5) {
            r4 = this;
            r4.f15579x = r5
            monitor-enter(r4)
            long r0 = r4.f15600A     // Catch: java.lang.Throwable -> L13
            r2 = 4
            long r0 = r0 | r2
            r4.f15600A = r0     // Catch: java.lang.Throwable -> L13
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L13
            r5 = 1
            r4.m1066c(r5)
            r4.m1059o()
            return
        L13:
            r5 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L13
            throw r5
    }
}
