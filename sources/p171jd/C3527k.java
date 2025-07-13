package p171jd;

/* renamed from: jd.k */
/* loaded from: classes.dex */
public class C3527k extends p171jd.AbstractC3523j {

    /* renamed from: y */
    public static final android.util.SparseIntArray f15266y = null;

    /* renamed from: w */
    public androidx.databinding.InterfaceC0360g f15267w;

    /* renamed from: x */
    public long f15268x;

    /* renamed from: jd.k$a */
    public class a implements androidx.databinding.InterfaceC0360g {

        /* renamed from: a */
        public final /* synthetic */ p171jd.C3527k f15269a;

        public a(p171jd.C3527k r1) {
                r0 = this;
                r0.f15269a = r1
                r0.<init>()
                return
        }

        @Override // androidx.databinding.InterfaceC0360g
        /* renamed from: a */
        public void mo1070a() {
                r5 = this;
                jd.k r0 = r5.f15269a
                com.google.android.material.textfield.TextInputEditText r0 = r0.f15243s
                java.lang.String r0 = p347u0.C6282f.m12908a(r0)
                jd.k r1 = r5.f15269a
                ud.q r1 = r1.f15245u
                r2 = 0
                r3 = 1
                if (r1 == 0) goto L12
                r4 = 1
                goto L13
            L12:
                r4 = 0
            L13:
                if (r4 == 0) goto L1f
                androidx.lifecycle.d0<java.lang.String> r1 = r1.f24885d
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
            p171jd.C3527k.f15266y = r0
            r1 = 2131362225(0x7f0a01b1, float:1.8344225E38)
            r2 = 2
            r0.put(r1, r2)
            r1 = 2131361981(0x7f0a00bd, float:1.834373E38)
            r2 = 3
            r0.put(r1, r2)
            r1 = 2131362298(0x7f0a01fa, float:1.8344373E38)
            r2 = 4
            r0.put(r1, r2)
            return
    }

    public C3527k(androidx.databinding.InterfaceC0358e r11, android.view.View r12) {
            r10 = this;
            android.util.SparseIntArray r0 = p171jd.C3527k.f15266y
            r1 = 5
            java.lang.Object[] r0 = androidx.databinding.ViewDataBinding.m1051k(r11, r12, r1, r0)
            r1 = 3
            r1 = r0[r1]
            r6 = r1
            androidx.appcompat.widget.AppCompatImageView r6 = (androidx.appcompat.widget.AppCompatImageView) r6
            r1 = 1
            r1 = r0[r1]
            r7 = r1
            com.google.android.material.textfield.TextInputEditText r7 = (com.google.android.material.textfield.TextInputEditText) r7
            r1 = 2
            r1 = r0[r1]
            r8 = r1
            com.google.android.material.card.MaterialCardView r8 = (com.google.android.material.card.MaterialCardView) r8
            r1 = 4
            r1 = r0[r1]
            r9 = r1
            androidx.recyclerview.widget.RecyclerView r9 = (androidx.recyclerview.widget.RecyclerView) r9
            r5 = 1
            r2 = r10
            r3 = r11
            r4 = r12
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            jd.k$a r11 = new jd.k$a
            r11.<init>(r10)
            r10.f15267w = r11
            r1 = -1
            r10.f15268x = r1
            com.google.android.material.textfield.TextInputEditText r11 = r10.f15243s
            r1 = 0
            r11.setTag(r1)
            r11 = 0
            r11 = r0[r11]
            androidx.appcompat.widget.LinearLayoutCompat r11 = (androidx.appcompat.widget.LinearLayoutCompat) r11
            r11.setTag(r1)
            r11 = 2131362083(0x7f0a0123, float:1.8343937E38)
            r12.setTag(r11, r10)
            monitor-enter(r10)
            r11 = 4
            r10.f15268x = r11     // Catch: java.lang.Throwable -> L4f
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L4f
            r10.m1059o()
            return
        L4f:
            r11 = move-exception
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L4f
            throw r11
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: e */
    public void mo1054e() {
            r9 = this;
            monitor-enter(r9)
            long r0 = r9.f15268x     // Catch: java.lang.Throwable -> L3c
            r2 = 0
            r9.f15268x = r2     // Catch: java.lang.Throwable -> L3c
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L3c
            ud.q r4 = r9.f15245u
            r5 = 7
            long r5 = r5 & r0
            r7 = 0
            int r8 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r8 == 0) goto L25
            if (r4 == 0) goto L17
            androidx.lifecycle.d0<java.lang.String> r4 = r4.f24885d
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
            com.google.android.material.textfield.TextInputEditText r5 = r9.f15243s
            p347u0.C6282f.m12909b(r5, r4)
        L2d:
            r4 = 4
            long r0 = r0 & r4
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L3b
            com.google.android.material.textfield.TextInputEditText r0 = r9.f15243s
            androidx.databinding.g r1 = r9.f15267w
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
            long r0 = r5.f15268x     // Catch: java.lang.Throwable -> Lf
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
            long r3 = r2.f15268x     // Catch: java.lang.Throwable -> L13
            r0 = 1
            long r3 = r3 | r0
            r2.f15268x = r3     // Catch: java.lang.Throwable -> L13
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

    @Override // p171jd.AbstractC3523j
    /* renamed from: r */
    public void mo7992r(p359ud.C6394q r5) {
            r4 = this;
            r4.f15245u = r5
            monitor-enter(r4)
            long r0 = r4.f15268x     // Catch: java.lang.Throwable -> L13
            r2 = 2
            long r0 = r0 | r2
            r4.f15268x = r0     // Catch: java.lang.Throwable -> L13
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
