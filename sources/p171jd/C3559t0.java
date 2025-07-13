package p171jd;

/* renamed from: jd.t0 */
/* loaded from: classes.dex */
public class C3559t0 extends p171jd.AbstractC3556s0 {

    /* renamed from: C */
    public static final android.util.SparseIntArray f15539C = null;

    /* renamed from: A */
    public androidx.databinding.InterfaceC0360g f15540A;

    /* renamed from: B */
    public long f15541B;

    /* renamed from: jd.t0$a */
    public class a implements androidx.databinding.InterfaceC0360g {

        /* renamed from: a */
        public final /* synthetic */ p171jd.C3559t0 f15542a;

        public a(p171jd.C3559t0 r1) {
                r0 = this;
                r0.f15542a = r1
                r0.<init>()
                return
        }

        @Override // androidx.databinding.InterfaceC0360g
        /* renamed from: a */
        public void mo1070a() {
                r5 = this;
                jd.t0 r0 = r5.f15542a
                com.google.android.material.textfield.TextInputEditText r0 = r0.f15513u
                java.lang.String r0 = p347u0.C6282f.m12908a(r0)
                jd.t0 r1 = r5.f15542a
                je.j r1 = r1.f15517y
                r2 = 0
                r3 = 1
                if (r1 == 0) goto L12
                r4 = 1
                goto L13
            L12:
                r4 = 0
            L13:
                if (r4 == 0) goto L1f
                androidx.lifecycle.d0<java.lang.String> r1 = r1.f15718d
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
            p171jd.C3559t0.f15539C = r0
            r1 = 2131362225(0x7f0a01b1, float:1.8344225E38)
            r2 = 2
            r0.put(r1, r2)
            r1 = 2131362359(0x7f0a0237, float:1.8344496E38)
            r2 = 3
            r0.put(r1, r2)
            r1 = 2131362710(0x7f0a0396, float:1.8345208E38)
            r2 = 4
            r0.put(r1, r2)
            r1 = 2131361981(0x7f0a00bd, float:1.834373E38)
            r2 = 5
            r0.put(r1, r2)
            r1 = 2131361997(0x7f0a00cd, float:1.8343762E38)
            r2 = 6
            r0.put(r1, r2)
            r1 = 2131362557(0x7f0a02fd, float:1.8344898E38)
            r2 = 7
            r0.put(r1, r2)
            r1 = 2131361982(0x7f0a00be, float:1.8343732E38)
            r2 = 8
            r0.put(r1, r2)
            r1 = 2131362298(0x7f0a01fa, float:1.8344373E38)
            r2 = 9
            r0.put(r1, r2)
            return
    }

    public C3559t0(androidx.databinding.InterfaceC0358e r17, android.view.View r18) {
            r16 = this;
            r14 = r16
            r0 = r18
            android.util.SparseIntArray r1 = p171jd.C3559t0.f15539C
            r2 = 10
            r3 = r17
            java.lang.Object[] r15 = androidx.databinding.ViewDataBinding.m1051k(r3, r0, r2, r1)
            r1 = 5
            r1 = r15[r1]
            r5 = r1
            androidx.appcompat.widget.AppCompatImageView r5 = (androidx.appcompat.widget.AppCompatImageView) r5
            r1 = 8
            r1 = r15[r1]
            r6 = r1
            androidx.appcompat.widget.AppCompatImageView r6 = (androidx.appcompat.widget.AppCompatImageView) r6
            r1 = 6
            r1 = r15[r1]
            r7 = r1
            androidx.cardview.widget.CardView r7 = (androidx.cardview.widget.CardView) r7
            r1 = 1
            r1 = r15[r1]
            r8 = r1
            com.google.android.material.textfield.TextInputEditText r8 = (com.google.android.material.textfield.TextInputEditText) r8
            r1 = 2
            r1 = r15[r1]
            r9 = r1
            com.google.android.material.card.MaterialCardView r9 = (com.google.android.material.card.MaterialCardView) r9
            r1 = 9
            r1 = r15[r1]
            r10 = r1
            androidx.recyclerview.widget.RecyclerView r10 = (androidx.recyclerview.widget.RecyclerView) r10
            r1 = 3
            r1 = r15[r1]
            r11 = r1
            androidx.constraintlayout.motion.widget.MotionLayout r11 = (androidx.constraintlayout.motion.widget.MotionLayout) r11
            r1 = 7
            r1 = r15[r1]
            r12 = r1
            androidx.appcompat.widget.AppCompatImageView r12 = (androidx.appcompat.widget.AppCompatImageView) r12
            r1 = 4
            r1 = r15[r1]
            r13 = r1
            androidx.appcompat.widget.AppCompatTextView r13 = (androidx.appcompat.widget.AppCompatTextView) r13
            r4 = 1
            r1 = r16
            r2 = r17
            r3 = r18
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            jd.t0$a r1 = new jd.t0$a
            r1.<init>(r14)
            r14.f15540A = r1
            r1 = -1
            r14.f15541B = r1
            com.google.android.material.textfield.TextInputEditText r1 = r14.f15513u
            r2 = 0
            r1.setTag(r2)
            r1 = 0
            r1 = r15[r1]
            androidx.appcompat.widget.LinearLayoutCompat r1 = (androidx.appcompat.widget.LinearLayoutCompat) r1
            r1.setTag(r2)
            r1 = 2131362083(0x7f0a0123, float:1.8343937E38)
            r0.setTag(r1, r14)
            monitor-enter(r16)
            r0 = 4
            r14.f15541B = r0     // Catch: java.lang.Throwable -> L79
            monitor-exit(r16)     // Catch: java.lang.Throwable -> L79
            r16.m1059o()
            return
        L79:
            r0 = move-exception
            monitor-exit(r16)     // Catch: java.lang.Throwable -> L79
            throw r0
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: e */
    public void mo1054e() {
            r9 = this;
            monitor-enter(r9)
            long r0 = r9.f15541B     // Catch: java.lang.Throwable -> L3c
            r2 = 0
            r9.f15541B = r2     // Catch: java.lang.Throwable -> L3c
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L3c
            je.j r4 = r9.f15517y
            r5 = 7
            long r5 = r5 & r0
            r7 = 0
            int r8 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r8 == 0) goto L25
            if (r4 == 0) goto L17
            androidx.lifecycle.d0<java.lang.String> r4 = r4.f15718d
            goto L18
        L17:
            r4 = r7
        L18:
            r5 = 0
            r9.m1061q(r5, r4)
            if (r4 == 0) goto L25
            java.lang.Object r4 = r4.m1411d()
            java.lang.String r4 = (java.lang.String) r4
            goto L26
        L25:
            r4 = r7
        L26:
            if (r8 == 0) goto L2d
            com.google.android.material.textfield.TextInputEditText r5 = r9.f15513u
            p347u0.C6282f.m12909b(r5, r4)
        L2d:
            r4 = 4
            long r0 = r0 & r4
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L3b
            com.google.android.material.textfield.TextInputEditText r0 = r9.f15513u
            androidx.databinding.g r1 = r9.f15540A
            p347u0.C6282f.m12910c(r0, r7, r7, r7, r1)
        L3b:
            return
        L3c:
            r0 = move-exception
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L3c
            throw r0
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: g */
    public boolean mo1056g() {
            r5 = this;
            monitor-enter(r5)
            long r0 = r5.f15541B     // Catch: java.lang.Throwable -> Lf
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
    public boolean mo1057l(int r3, java.lang.Object r4, int r5) {
            r2 = this;
            r0 = 0
            if (r3 == 0) goto L4
            return r0
        L4:
            androidx.lifecycle.d0 r4 = (androidx.lifecycle.C0437d0) r4
            if (r5 != 0) goto L16
            monitor-enter(r2)
            long r3 = r2.f15541B     // Catch: java.lang.Throwable -> L13
            r0 = 1
            long r3 = r3 | r0
            r2.f15541B = r3     // Catch: java.lang.Throwable -> L13
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L13
            r0 = 1
            goto L16
        L13:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L13
            throw r3
        L16:
            return r0
    }

    @Override // p171jd.AbstractC3556s0
    /* renamed from: r */
    public void mo8007r(je.C3588j r5) {
            r4 = this;
            r4.f15517y = r5
            monitor-enter(r4)
            long r0 = r4.f15541B     // Catch: java.lang.Throwable -> L13
            r2 = 2
            long r0 = r0 | r2
            r4.f15541B = r0     // Catch: java.lang.Throwable -> L13
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
