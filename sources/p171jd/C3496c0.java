package p171jd;

/* renamed from: jd.c0 */
/* loaded from: classes.dex */
public class C3496c0 extends p171jd.AbstractC3492b0 implements p191kd.C4096a.a {

    /* renamed from: D */
    public static final android.util.SparseIntArray f15043D = null;

    /* renamed from: A */
    public final p347u0.C6282f.d f15044A;

    /* renamed from: B */
    public androidx.databinding.InterfaceC0360g f15045B;

    /* renamed from: C */
    public long f15046C;

    /* renamed from: jd.c0$a */
    public class a implements androidx.databinding.InterfaceC0360g {

        /* renamed from: a */
        public final /* synthetic */ p171jd.C3496c0 f15047a;

        public a(p171jd.C3496c0 r1) {
                r0 = this;
                r0.f15047a = r1
                r0.<init>()
                return
        }

        @Override // androidx.databinding.InterfaceC0360g
        /* renamed from: a */
        public void mo1070a() {
                r5 = this;
                jd.c0 r0 = r5.f15047a
                com.google.android.material.textfield.MaterialAutoCompleteTextView r0 = r0.f15019r
                java.lang.String r0 = p347u0.C6282f.m12908a(r0)
                jd.c0 r1 = r5.f15047a
                be.g r1 = r1.f15026y
                r2 = 0
                r3 = 1
                if (r1 == 0) goto L12
                r4 = 1
                goto L13
            L12:
                r4 = 0
            L13:
                if (r4 == 0) goto L1f
                androidx.lifecycle.d0<java.lang.String> r1 = r1.f4050q
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
            p171jd.C3496c0.f15043D = r0
            r1 = 2131362225(0x7f0a01b1, float:1.8344225E38)
            r2 = 3
            r0.put(r1, r2)
            r1 = 2131362710(0x7f0a0396, float:1.8345208E38)
            r2 = 4
            r0.put(r1, r2)
            r1 = 2131361981(0x7f0a00bd, float:1.834373E38)
            r2 = 5
            r0.put(r1, r2)
            r1 = 2131362513(0x7f0a02d1, float:1.8344809E38)
            r2 = 6
            r0.put(r1, r2)
            r1 = 2131362579(0x7f0a0313, float:1.8344943E38)
            r2 = 7
            r0.put(r1, r2)
            r1 = 2131362048(0x7f0a0100, float:1.8343866E38)
            r2 = 8
            r0.put(r1, r2)
            r1 = 2131362286(0x7f0a01ee, float:1.8344348E38)
            r2 = 9
            r0.put(r1, r2)
            r1 = 2131361950(0x7f0a009e, float:1.8343667E38)
            r2 = 10
            r0.put(r1, r2)
            return
    }

    public C3496c0(androidx.databinding.InterfaceC0358e r19, android.view.View r20) {
            r18 = this;
            r15 = r18
            r0 = r20
            android.util.SparseIntArray r1 = p171jd.C3496c0.f15043D
            r2 = 11
            r3 = r19
            java.lang.Object[] r16 = androidx.databinding.ViewDataBinding.m1051k(r3, r0, r2, r1)
            r1 = 2
            r1 = r16[r1]
            r5 = r1
            com.google.android.material.textfield.MaterialAutoCompleteTextView r5 = (com.google.android.material.textfield.MaterialAutoCompleteTextView) r5
            r1 = 10
            r1 = r16[r1]
            r6 = r1
            com.google.android.material.button.MaterialButton r6 = (com.google.android.material.button.MaterialButton) r6
            r1 = 5
            r1 = r16[r1]
            r7 = r1
            androidx.appcompat.widget.AppCompatImageView r7 = (androidx.appcompat.widget.AppCompatImageView) r7
            r1 = 8
            r1 = r16[r1]
            r8 = r1
            androidx.appcompat.widget.AppCompatImageView r8 = (androidx.appcompat.widget.AppCompatImageView) r8
            r1 = 3
            r1 = r16[r1]
            r9 = r1
            com.google.android.material.card.MaterialCardView r9 = (com.google.android.material.card.MaterialCardView) r9
            r1 = 9
            r1 = r16[r1]
            r10 = r1
            androidx.appcompat.widget.AppCompatTextView r10 = (androidx.appcompat.widget.AppCompatTextView) r10
            r14 = 1
            r1 = r16[r14]
            r11 = r1
            com.google.android.material.textfield.TextInputEditText r11 = (com.google.android.material.textfield.TextInputEditText) r11
            r1 = 6
            r1 = r16[r1]
            r12 = r1
            com.google.android.material.textfield.TextInputLayout r12 = (com.google.android.material.textfield.TextInputLayout) r12
            r1 = 7
            r1 = r16[r1]
            r13 = r1
            androidx.appcompat.widget.AppCompatTextView r13 = (androidx.appcompat.widget.AppCompatTextView) r13
            r1 = 4
            r1 = r16[r1]
            r17 = r1
            androidx.appcompat.widget.AppCompatTextView r17 = (androidx.appcompat.widget.AppCompatTextView) r17
            r4 = 2
            r1 = r18
            r2 = r19
            r3 = r20
            r14 = r17
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            jd.c0$a r1 = new jd.c0$a
            r1.<init>(r15)
            r15.f15045B = r1
            r1 = -1
            r15.f15046C = r1
            com.google.android.material.textfield.MaterialAutoCompleteTextView r1 = r15.f15019r
            r2 = 0
            r1.setTag(r2)
            r1 = 0
            r1 = r16[r1]
            androidx.constraintlayout.widget.ConstraintLayout r1 = (androidx.constraintlayout.widget.ConstraintLayout) r1
            r1.setTag(r2)
            com.google.android.material.textfield.TextInputEditText r1 = r15.f15024w
            r1.setTag(r2)
            r1 = 2131362083(0x7f0a0123, float:1.8343937E38)
            r0.setTag(r1, r15)
            kd.a r0 = new kd.a
            r1 = 1
            r0.<init>(r15, r1)
            r15.f15044A = r0
            monitor-enter(r18)
            r0 = 8
            r15.f15046C = r0     // Catch: java.lang.Throwable -> L90
            monitor-exit(r18)     // Catch: java.lang.Throwable -> L90
            r18.m1059o()
            return
        L90:
            r0 = move-exception
            monitor-exit(r18)     // Catch: java.lang.Throwable -> L90
            throw r0
    }

    @Override // p191kd.C4096a.a
    /* renamed from: a */
    public final void mo7970a(int r1, java.lang.CharSequence r2, int r3, int r4, int r5) {
            r0 = this;
            be.g r1 = r0.f15026y
            if (r1 == 0) goto L6
            r3 = 1
            goto L7
        L6:
            r3 = 0
        L7:
            if (r3 == 0) goto L3d
            java.util.Objects.requireNonNull(r1)
            java.lang.String r3 = "charSequence"
            p214m2.C4339q.m9706k(r2, r3)
            java.lang.String r2 = r2.toString()
            androidx.lifecycle.d0<java.lang.String> r3 = r1.f4049p
            java.lang.Object r3 = r3.m1411d()
            boolean r3 = p214m2.C4339q.m9702c(r2, r3)
            if (r3 == 0) goto L22
            goto L3d
        L22:
            java.lang.Double r3 = p362uh.C6462h.m13048E(r2)
            androidx.lifecycle.d0<od.b0> r4 = r1.f4043j
            java.lang.Object r4 = r4.m1411d()
            od.b0 r4 = (p255od.C5194b0) r4
            if (r3 == 0) goto L36
            if (r4 != 0) goto L33
            goto L36
        L33:
            androidx.lifecycle.d0<java.lang.String> r1 = r1.f4049p
            goto L3a
        L36:
            androidx.lifecycle.d0<java.lang.String> r1 = r1.f4049p
            java.lang.String r2 = ""
        L3a:
            r1.mo7l(r2)
        L3d:
            return
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: e */
    public void mo1054e() {
            r14 = this;
            monitor-enter(r14)
            long r0 = r14.f15046C     // Catch: java.lang.Throwable -> L77
            r2 = 0
            r14.f15046C = r2     // Catch: java.lang.Throwable -> L77
            monitor-exit(r14)     // Catch: java.lang.Throwable -> L77
            be.g r4 = r14.f15026y
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
            androidx.lifecycle.d0<java.lang.String> r5 = r4.f4050q
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
            androidx.lifecycle.d0<java.lang.String> r4 = r4.f4049p
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
            com.google.android.material.textfield.MaterialAutoCompleteTextView r6 = r14.f15019r
            p347u0.C6282f.m12909b(r6, r5)
        L57:
            r5 = 8
            long r5 = r5 & r0
            int r9 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r9 == 0) goto L6c
            com.google.android.material.textfield.MaterialAutoCompleteTextView r5 = r14.f15019r
            androidx.databinding.g r6 = r14.f15045B
            p347u0.C6282f.m12910c(r5, r11, r11, r11, r6)
            com.google.android.material.textfield.TextInputEditText r5 = r14.f15024w
            u0.f$d r6 = r14.f15044A
            p347u0.C6282f.m12910c(r5, r11, r6, r11, r11)
        L6c:
            long r0 = r0 & r7
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 == 0) goto L76
            com.google.android.material.textfield.TextInputEditText r0 = r14.f15024w
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
            long r0 = r5.f15046C     // Catch: java.lang.Throwable -> Lf
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
            long r5 = r4.f15046C     // Catch: java.lang.Throwable -> L16
            r2 = 2
            long r5 = r5 | r2
            r4.f15046C = r5     // Catch: java.lang.Throwable -> L16
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
            long r5 = r4.f15046C     // Catch: java.lang.Throwable -> L29
            r2 = 1
            long r5 = r5 | r2
            r4.f15046C = r5     // Catch: java.lang.Throwable -> L29
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

    @Override // p171jd.AbstractC3492b0
    /* renamed from: r */
    public void mo7967r(be.C0740g r5) {
            r4 = this;
            r4.f15026y = r5
            monitor-enter(r4)
            long r0 = r4.f15046C     // Catch: java.lang.Throwable -> L13
            r2 = 4
            long r0 = r0 | r2
            r4.f15046C = r0     // Catch: java.lang.Throwable -> L13
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
