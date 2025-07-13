package p171jd;

/* renamed from: jd.z1 */
/* loaded from: classes.dex */
public class C3578z1 extends p171jd.AbstractC3575y1 {

    /* renamed from: B */
    public static final android.util.SparseIntArray f15684B = null;

    /* renamed from: A */
    public long f15685A;

    /* renamed from: y */
    public androidx.databinding.InterfaceC0360g f15686y;

    /* renamed from: z */
    public androidx.databinding.InterfaceC0360g f15687z;

    /* renamed from: jd.z1$a */
    public class a implements androidx.databinding.InterfaceC0360g {

        /* renamed from: a */
        public final /* synthetic */ p171jd.C3578z1 f15688a;

        public a(p171jd.C3578z1 r1) {
                r0 = this;
                r0.f15688a = r1
                r0.<init>()
                return
        }

        @Override // androidx.databinding.InterfaceC0360g
        /* renamed from: a */
        public void mo1070a() {
                r5 = this;
                jd.z1 r0 = r5.f15688a
                com.google.android.material.textfield.MaterialAutoCompleteTextView r0 = r0.f15663r
                java.lang.String r0 = p347u0.C6282f.m12908a(r0)
                jd.z1 r1 = r5.f15688a
                yf.f r1 = r1.f15668w
                r2 = 0
                r3 = 1
                if (r1 == 0) goto L12
                r4 = 1
                goto L13
            L12:
                r4 = 0
            L13:
                if (r4 == 0) goto L1f
                androidx.lifecycle.d0<java.lang.String> r1 = r1.f27740i
                if (r1 == 0) goto L1a
                r2 = 1
            L1a:
                if (r2 == 0) goto L1f
                r1.mo7l(r0)
            L1f:
                return
        }
    }

    /* renamed from: jd.z1$b */
    public class b implements androidx.databinding.InterfaceC0360g {

        /* renamed from: a */
        public final /* synthetic */ p171jd.C3578z1 f15689a;

        public b(p171jd.C3578z1 r1) {
                r0 = this;
                r0.f15689a = r1
                r0.<init>()
                return
        }

        @Override // androidx.databinding.InterfaceC0360g
        /* renamed from: a */
        public void mo1070a() {
                r5 = this;
                jd.z1 r0 = r5.f15689a
                com.google.android.material.textfield.TextInputEditText r0 = r0.f15667v
                java.lang.String r0 = p347u0.C6282f.m12908a(r0)
                jd.z1 r1 = r5.f15689a
                yf.f r1 = r1.f15668w
                r2 = 0
                r3 = 1
                if (r1 == 0) goto L12
                r4 = 1
                goto L13
            L12:
                r4 = 0
            L13:
                if (r4 == 0) goto L1f
                androidx.lifecycle.d0<java.lang.String> r1 = r1.f27741j
                if (r1 == 0) goto L1a
                r2 = 1
            L1a:
                if (r2 == 0) goto L1f
                r1.mo7l(r0)
            L1f:
                return
        }
    }

    static {
            android.util.SparseIntArray r0 = new android.util.SparseIntArray
            r0.<init>()
            p171jd.C3578z1.f15684B = r0
            r1 = 2131362048(0x7f0a0100, float:1.8343866E38)
            r2 = 3
            r0.put(r1, r2)
            r1 = 2131361963(0x7f0a00ab, float:1.8343693E38)
            r2 = 4
            r0.put(r1, r2)
            r1 = 2131361944(0x7f0a0098, float:1.8343655E38)
            r2 = 5
            r0.put(r1, r2)
            return
    }

    public C3578z1(androidx.databinding.InterfaceC0358e r12, android.view.View r13) {
            r11 = this;
            android.util.SparseIntArray r0 = p171jd.C3578z1.f15684B
            r1 = 6
            java.lang.Object[] r0 = androidx.databinding.ViewDataBinding.m1051k(r12, r13, r1, r0)
            r1 = 1
            r1 = r0[r1]
            r6 = r1
            com.google.android.material.textfield.MaterialAutoCompleteTextView r6 = (com.google.android.material.textfield.MaterialAutoCompleteTextView) r6
            r1 = 5
            r1 = r0[r1]
            r7 = r1
            com.google.android.material.button.MaterialButton r7 = (com.google.android.material.button.MaterialButton) r7
            r1 = 4
            r1 = r0[r1]
            r8 = r1
            com.google.android.material.button.MaterialButton r8 = (com.google.android.material.button.MaterialButton) r8
            r1 = 3
            r1 = r0[r1]
            r9 = r1
            androidx.appcompat.widget.AppCompatImageView r9 = (androidx.appcompat.widget.AppCompatImageView) r9
            r1 = 2
            r1 = r0[r1]
            r10 = r1
            com.google.android.material.textfield.TextInputEditText r10 = (com.google.android.material.textfield.TextInputEditText) r10
            r5 = 2
            r2 = r11
            r3 = r12
            r4 = r13
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            jd.z1$a r12 = new jd.z1$a
            r12.<init>(r11)
            r11.f15686y = r12
            jd.z1$b r12 = new jd.z1$b
            r12.<init>(r11)
            r11.f15687z = r12
            r1 = -1
            r11.f15685A = r1
            com.google.android.material.textfield.MaterialAutoCompleteTextView r12 = r11.f15663r
            r1 = 0
            r12.setTag(r1)
            r12 = 0
            r12 = r0[r12]
            androidx.appcompat.widget.LinearLayoutCompat r12 = (androidx.appcompat.widget.LinearLayoutCompat) r12
            r12.setTag(r1)
            com.google.android.material.textfield.TextInputEditText r12 = r11.f15667v
            r12.setTag(r1)
            r12 = 2131362083(0x7f0a0123, float:1.8343937E38)
            r13.setTag(r12, r11)
            monitor-enter(r11)
            r12 = 8
            r11.f15685A = r12     // Catch: java.lang.Throwable -> L61
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L61
            r11.m1059o()
            return
        L61:
            r12 = move-exception
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L61
            throw r12
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: e */
    public void mo1054e() {
            r14 = this;
            monitor-enter(r14)
            long r0 = r14.f15685A     // Catch: java.lang.Throwable -> L77
            r2 = 0
            r14.f15685A = r2     // Catch: java.lang.Throwable -> L77
            monitor-exit(r14)     // Catch: java.lang.Throwable -> L77
            yf.f r4 = r14.f15668w
            r5 = 15
            long r5 = r5 & r0
            r7 = 13
            r9 = 14
            r11 = 0
            int r12 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r12 == 0) goto L4b
            long r5 = r0 & r7
            int r12 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r12 == 0) goto L2f
            if (r4 == 0) goto L21
            androidx.lifecycle.d0<java.lang.String> r5 = r4.f27741j
            goto L22
        L21:
            r5 = r11
        L22:
            r6 = 0
            r14.m1061q(r6, r5)
            if (r5 == 0) goto L2f
            java.lang.Object r5 = r5.m1411d()
            java.lang.String r5 = (java.lang.String) r5
            goto L30
        L2f:
            r5 = r11
        L30:
            long r12 = r0 & r9
            int r6 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r6 == 0) goto L49
            if (r4 == 0) goto L3b
            androidx.lifecycle.d0<java.lang.String> r4 = r4.f27740i
            goto L3c
        L3b:
            r4 = r11
        L3c:
            r6 = 1
            r14.m1061q(r6, r4)
            if (r4 == 0) goto L49
            java.lang.Object r4 = r4.m1411d()
            java.lang.String r4 = (java.lang.String) r4
            goto L4d
        L49:
            r4 = r11
            goto L4d
        L4b:
            r4 = r11
            r5 = r4
        L4d:
            long r9 = r9 & r0
            int r6 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r6 == 0) goto L57
            com.google.android.material.textfield.MaterialAutoCompleteTextView r6 = r14.f15663r
            p347u0.C6282f.m12909b(r6, r4)
        L57:
            r9 = 8
            long r9 = r9 & r0
            int r4 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r4 == 0) goto L6c
            com.google.android.material.textfield.MaterialAutoCompleteTextView r4 = r14.f15663r
            androidx.databinding.g r6 = r14.f15686y
            p347u0.C6282f.m12910c(r4, r11, r11, r11, r6)
            com.google.android.material.textfield.TextInputEditText r4 = r14.f15667v
            androidx.databinding.g r6 = r14.f15687z
            p347u0.C6282f.m12910c(r4, r11, r11, r11, r6)
        L6c:
            long r0 = r0 & r7
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L76
            com.google.android.material.textfield.TextInputEditText r0 = r14.f15667v
            p347u0.C6282f.m12909b(r0, r5)
        L76:
            return
        L77:
            r0 = move-exception
            monitor-exit(r14)     // Catch: java.lang.Throwable -> L77
            throw r0
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: g */
    public boolean mo1056g() {
            r5 = this;
            monitor-enter(r5)
            long r0 = r5.f15685A     // Catch: java.lang.Throwable -> Lf
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
            long r5 = r4.f15685A     // Catch: java.lang.Throwable -> L16
            r2 = 2
            long r5 = r5 | r2
            r4.f15685A = r5     // Catch: java.lang.Throwable -> L16
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
            long r5 = r4.f15685A     // Catch: java.lang.Throwable -> L29
            r2 = 1
            long r5 = r5 | r2
            r4.f15685A = r5     // Catch: java.lang.Throwable -> L29
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

    @Override // p171jd.AbstractC3575y1
    /* renamed from: r */
    public void mo8015r(p437yf.C7202f r5) {
            r4 = this;
            r4.f15668w = r5
            monitor-enter(r4)
            long r0 = r4.f15685A     // Catch: java.lang.Throwable -> L13
            r2 = 4
            long r0 = r0 | r2
            r4.f15685A = r0     // Catch: java.lang.Throwable -> L13
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
