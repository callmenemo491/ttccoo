package p171jd;

/* renamed from: jd.e */
/* loaded from: classes.dex */
public class C3503e extends p171jd.AbstractC3499d implements p191kd.C4096a.a {

    /* renamed from: D */
    public static final android.util.SparseIntArray f15100D = null;

    /* renamed from: A */
    public final p347u0.C6282f.d f15101A;

    /* renamed from: B */
    public androidx.databinding.InterfaceC0360g f15102B;

    /* renamed from: C */
    public long f15103C;

    /* renamed from: jd.e$a */
    public class a implements androidx.databinding.InterfaceC0360g {

        /* renamed from: a */
        public final /* synthetic */ p171jd.C3503e f15104a;

        public a(p171jd.C3503e r1) {
                r0 = this;
                r0.f15104a = r1
                r0.<init>()
                return
        }

        @Override // androidx.databinding.InterfaceC0360g
        /* renamed from: a */
        public void mo1070a() {
                r5 = this;
                jd.e r0 = r5.f15104a
                com.google.android.material.textfield.MaterialAutoCompleteTextView r0 = r0.f15071r
                java.lang.String r0 = p347u0.C6282f.m12908a(r0)
                jd.e r1 = r5.f15104a
                ge.j r1 = r1.f15078y
                r2 = 0
                r3 = 1
                if (r1 == 0) goto L12
                r4 = 1
                goto L13
            L12:
                r4 = 0
            L13:
                if (r4 == 0) goto L1f
                androidx.lifecycle.d0<java.lang.String> r1 = r1.f10619m
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
            p171jd.C3503e.f15100D = r0
            r1 = 2131362678(0x7f0a0376, float:1.8345143E38)
            r2 = 3
            r0.put(r1, r2)
            r1 = 2131362052(0x7f0a0104, float:1.8343874E38)
            r2 = 4
            r0.put(r1, r2)
            r1 = 2131362048(0x7f0a0100, float:1.8343866E38)
            r2 = 5
            r0.put(r1, r2)
            r1 = 2131362578(0x7f0a0312, float:1.834494E38)
            r2 = 6
            r0.put(r1, r2)
            r1 = 2131361915(0x7f0a007b, float:1.8343596E38)
            r2 = 7
            r0.put(r1, r2)
            r1 = 2131361943(0x7f0a0097, float:1.8343653E38)
            r2 = 8
            r0.put(r1, r2)
            r1 = 2131361944(0x7f0a0098, float:1.8343655E38)
            r2 = 9
            r0.put(r1, r2)
            return
    }

    public C3503e(androidx.databinding.InterfaceC0358e r18, android.view.View r19) {
            r17 = this;
            r14 = r17
            r0 = r19
            android.util.SparseIntArray r1 = p171jd.C3503e.f15100D
            r2 = 10
            r3 = r18
            java.lang.Object[] r15 = androidx.databinding.ViewDataBinding.m1051k(r3, r0, r2, r1)
            r1 = 2
            r1 = r15[r1]
            r5 = r1
            com.google.android.material.textfield.MaterialAutoCompleteTextView r5 = (com.google.android.material.textfield.MaterialAutoCompleteTextView) r5
            r1 = 7
            r1 = r15[r1]
            r6 = r1
            androidx.appcompat.widget.AppCompatTextView r6 = (androidx.appcompat.widget.AppCompatTextView) r6
            r1 = 8
            r1 = r15[r1]
            r7 = r1
            com.google.android.material.button.MaterialButton r7 = (com.google.android.material.button.MaterialButton) r7
            r1 = 9
            r1 = r15[r1]
            r8 = r1
            com.google.android.material.button.MaterialButton r8 = (com.google.android.material.button.MaterialButton) r8
            r1 = 5
            r1 = r15[r1]
            r9 = r1
            androidx.appcompat.widget.AppCompatImageView r9 = (androidx.appcompat.widget.AppCompatImageView) r9
            r1 = 4
            r1 = r15[r1]
            r10 = r1
            android.widget.FrameLayout r10 = (android.widget.FrameLayout) r10
            r13 = 1
            r1 = r15[r13]
            r11 = r1
            com.google.android.material.textfield.TextInputEditText r11 = (com.google.android.material.textfield.TextInputEditText) r11
            r1 = 6
            r1 = r15[r1]
            r12 = r1
            androidx.appcompat.widget.AppCompatTextView r12 = (androidx.appcompat.widget.AppCompatTextView) r12
            r1 = 3
            r1 = r15[r1]
            r16 = r1
            com.google.android.material.textfield.TextInputLayout r16 = (com.google.android.material.textfield.TextInputLayout) r16
            r4 = 2
            r1 = r17
            r2 = r18
            r3 = r19
            r13 = r16
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            jd.e$a r1 = new jd.e$a
            r1.<init>(r14)
            r14.f15102B = r1
            r1 = -1
            r14.f15103C = r1
            com.google.android.material.textfield.MaterialAutoCompleteTextView r1 = r14.f15071r
            r2 = 0
            r1.setTag(r2)
            com.google.android.material.textfield.TextInputEditText r1 = r14.f15076w
            r1.setTag(r2)
            r1 = 0
            r1 = r15[r1]
            androidx.constraintlayout.widget.ConstraintLayout r1 = (androidx.constraintlayout.widget.ConstraintLayout) r1
            r1.setTag(r2)
            r1 = 2131362083(0x7f0a0123, float:1.8343937E38)
            r0.setTag(r1, r14)
            kd.a r0 = new kd.a
            r1 = 1
            r0.<init>(r14, r1)
            r14.f15101A = r0
            monitor-enter(r17)
            r0 = 8
            r14.f15103C = r0     // Catch: java.lang.Throwable -> L89
            monitor-exit(r17)     // Catch: java.lang.Throwable -> L89
            r17.m1059o()
            return
        L89:
            r0 = move-exception
            monitor-exit(r17)     // Catch: java.lang.Throwable -> L89
            throw r0
    }

    @Override // p191kd.C4096a.a
    /* renamed from: a */
    public final void mo7970a(int r5, java.lang.CharSequence r6, int r7, int r8, int r9) {
            r4 = this;
            ge.j r5 = r4.f15078y
            r7 = 0
            if (r5 == 0) goto L7
            r8 = 1
            goto L8
        L7:
            r8 = 0
        L8:
            if (r8 == 0) goto L4f
            java.util.Objects.requireNonNull(r5)
            java.lang.String r8 = "charSequence"
            p214m2.C4339q.m9706k(r6, r8)
            java.lang.String r6 = r6.toString()
            androidx.lifecycle.d0<java.lang.String> r8 = r5.f10611e
            java.lang.Object r8 = r8.m1411d()
            boolean r8 = p214m2.C4339q.m9702c(r6, r8)
            if (r8 == 0) goto L23
            goto L4f
        L23:
            java.lang.Double r8 = p362uh.C6462h.m13048E(r6)
            java.lang.Double r9 = r5.f10620n
            if (r8 == 0) goto L48
            if (r9 != 0) goto L2e
            goto L48
        L2e:
            double r0 = r8.doubleValue()
            double r2 = r9.doubleValue()
            int r8 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            androidx.lifecycle.d0<java.lang.String> r5 = r5.f10611e
            if (r8 <= 0) goto L4c
            double r8 = r9.doubleValue()
            r6 = 8
            r0 = 2
            java.lang.String r6 = vg.C6672m.m13535v(r8, r6, r7, r0)
            goto L4c
        L48:
            androidx.lifecycle.d0<java.lang.String> r5 = r5.f10611e
            java.lang.String r6 = ""
        L4c:
            r5.mo7l(r6)
        L4f:
            return
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: e */
    public void mo1054e() {
            r14 = this;
            monitor-enter(r14)
            long r0 = r14.f15103C     // Catch: java.lang.Throwable -> L77
            r2 = 0
            r14.f15103C = r2     // Catch: java.lang.Throwable -> L77
            monitor-exit(r14)     // Catch: java.lang.Throwable -> L77
            ge.j r4 = r14.f15078y
            r5 = 15
            long r5 = r5 & r0
            r7 = 14
            r9 = 13
            r11 = 0
            int r12 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r12 == 0) goto L4b
            long r5 = r0 & r9
            int r12 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r12 == 0) goto L2f
            if (r4 == 0) goto L21
            androidx.lifecycle.d0<java.lang.String> r5 = r4.f10619m
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
            long r12 = r0 & r7
            int r6 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r6 == 0) goto L49
            if (r4 == 0) goto L3b
            androidx.lifecycle.d0<java.lang.String> r4 = r4.f10611e
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
            com.google.android.material.textfield.MaterialAutoCompleteTextView r6 = r14.f15071r
            p347u0.C6282f.m12909b(r6, r5)
        L57:
            r5 = 8
            long r5 = r5 & r0
            int r9 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r9 == 0) goto L6c
            com.google.android.material.textfield.MaterialAutoCompleteTextView r5 = r14.f15071r
            androidx.databinding.g r6 = r14.f15102B
            p347u0.C6282f.m12910c(r5, r11, r11, r11, r6)
            com.google.android.material.textfield.TextInputEditText r5 = r14.f15076w
            u0.f$d r6 = r14.f15101A
            p347u0.C6282f.m12910c(r5, r11, r6, r11, r11)
        L6c:
            long r0 = r0 & r7
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 == 0) goto L76
            com.google.android.material.textfield.TextInputEditText r0 = r14.f15076w
            p347u0.C6282f.m12909b(r0, r4)
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
            long r0 = r5.f15103C     // Catch: java.lang.Throwable -> Lf
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
            long r5 = r4.f15103C     // Catch: java.lang.Throwable -> L16
            r2 = 2
            long r5 = r5 | r2
            r4.f15103C = r5     // Catch: java.lang.Throwable -> L16
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
            long r5 = r4.f15103C     // Catch: java.lang.Throwable -> L29
            r2 = 1
            long r5 = r5 | r2
            r4.f15103C = r5     // Catch: java.lang.Throwable -> L29
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

    @Override // p171jd.AbstractC3499d
    /* renamed from: r */
    public void mo7972r(ge.C2337j r5) {
            r4 = this;
            r4.f15078y = r5
            monitor-enter(r4)
            long r0 = r4.f15103C     // Catch: java.lang.Throwable -> L13
            r2 = 4
            long r0 = r0 | r2
            r4.f15103C = r0     // Catch: java.lang.Throwable -> L13
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
