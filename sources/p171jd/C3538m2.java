package p171jd;

/* renamed from: jd.m2 */
/* loaded from: classes.dex */
public class C3538m2 extends p171jd.AbstractC3534l2 implements p191kd.C4096a.a {

    /* renamed from: D */
    public static final android.util.SparseIntArray f15345D = null;

    /* renamed from: B */
    public final p347u0.C6282f.d f15346B;

    /* renamed from: C */
    public long f15347C;

    static {
            android.util.SparseIntArray r0 = new android.util.SparseIntArray
            r0.<init>()
            p171jd.C3538m2.f15345D = r0
            r1 = 2131362711(0x7f0a0397, float:1.834521E38)
            r2 = 2
            r0.put(r1, r2)
            r1 = 2131362678(0x7f0a0376, float:1.8345143E38)
            r2 = 3
            r0.put(r1, r2)
            r1 = 2131362578(0x7f0a0312, float:1.834494E38)
            r2 = 4
            r0.put(r1, r2)
            r1 = 2131361915(0x7f0a007b, float:1.8343596E38)
            r2 = 5
            r0.put(r1, r2)
            r1 = 2131362190(0x7f0a018e, float:1.8344154E38)
            r2 = 6
            r0.put(r1, r2)
            r1 = 2131362191(0x7f0a018f, float:1.8344156E38)
            r2 = 7
            r0.put(r1, r2)
            r1 = 2131361940(0x7f0a0094, float:1.8343647E38)
            r2 = 8
            r0.put(r1, r2)
            r1 = 2131361944(0x7f0a0098, float:1.8343655E38)
            r2 = 9
            r0.put(r1, r2)
            return
    }

    public C3538m2(androidx.databinding.InterfaceC0358e r18, android.view.View r19) {
            r17 = this;
            r14 = r17
            r0 = r19
            android.util.SparseIntArray r1 = p171jd.C3538m2.f15345D
            r2 = 10
            r3 = r18
            java.lang.Object[] r15 = androidx.databinding.ViewDataBinding.m1051k(r3, r0, r2, r1)
            r13 = 1
            r1 = r15[r13]
            r5 = r1
            com.google.android.material.textfield.TextInputEditText r5 = (com.google.android.material.textfield.TextInputEditText) r5
            r1 = 5
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
            r1 = 6
            r1 = r15[r1]
            r9 = r1
            androidx.appcompat.widget.LinearLayoutCompat r9 = (androidx.appcompat.widget.LinearLayoutCompat) r9
            r1 = 7
            r1 = r15[r1]
            r10 = r1
            androidx.appcompat.widget.AppCompatTextView r10 = (androidx.appcompat.widget.AppCompatTextView) r10
            r1 = 4
            r1 = r15[r1]
            r11 = r1
            androidx.appcompat.widget.AppCompatTextView r11 = (androidx.appcompat.widget.AppCompatTextView) r11
            r1 = 3
            r1 = r15[r1]
            r12 = r1
            com.google.android.material.textfield.TextInputLayout r12 = (com.google.android.material.textfield.TextInputLayout) r12
            r1 = 2
            r1 = r15[r1]
            r16 = r1
            androidx.appcompat.widget.AppCompatTextView r16 = (androidx.appcompat.widget.AppCompatTextView) r16
            r4 = 1
            r1 = r17
            r2 = r18
            r3 = r19
            r13 = r16
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r1 = -1
            r14.f15347C = r1
            com.google.android.material.textfield.TextInputEditText r1 = r14.f15319r
            r2 = 0
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
            r14.f15346B = r0
            monitor-enter(r17)
            r0 = 4
            r14.f15347C = r0     // Catch: java.lang.Throwable -> L7d
            monitor-exit(r17)     // Catch: java.lang.Throwable -> L7d
            r17.m1059o()
            return
        L7d:
            r0 = move-exception
            monitor-exit(r17)     // Catch: java.lang.Throwable -> L7d
            throw r0
    }

    @Override // p191kd.C4096a.a
    /* renamed from: a */
    public final void mo7970a(int r3, java.lang.CharSequence r4, int r5, int r6, int r7) {
            r2 = this;
            pf.g r3 = r2.f15327z
            if (r3 == 0) goto L6
            r5 = 1
            goto L7
        L6:
            r5 = 0
        L7:
            if (r5 == 0) goto L3d
            java.util.Objects.requireNonNull(r3)
            java.lang.String r5 = "charSequence"
            p214m2.C4339q.m9706k(r4, r5)
            java.lang.String r4 = r4.toString()
            androidx.lifecycle.d0<java.lang.String> r5 = r3.f21464n
            java.lang.Object r5 = r5.m1411d()
            boolean r5 = p214m2.C4339q.m9702c(r4, r5)
            if (r5 == 0) goto L22
            goto L3d
        L22:
            java.lang.Double r5 = p362uh.C6462h.m13048E(r4)
            if (r5 == 0) goto L36
            double r5 = r5.doubleValue()
            r0 = 0
            int r7 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r7 >= 0) goto L33
            goto L36
        L33:
            androidx.lifecycle.d0<java.lang.String> r3 = r3.f21464n
            goto L3a
        L36:
            androidx.lifecycle.d0<java.lang.String> r3 = r3.f21464n
            java.lang.String r4 = ""
        L3a:
            r3.mo7l(r4)
        L3d:
            return
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: e */
    public void mo1054e() {
            r9 = this;
            monitor-enter(r9)
            long r0 = r9.f15347C     // Catch: java.lang.Throwable -> L3c
            r2 = 0
            r9.f15347C = r2     // Catch: java.lang.Throwable -> L3c
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L3c
            pf.g r4 = r9.f15327z
            r5 = 7
            long r5 = r5 & r0
            r7 = 0
            int r8 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r8 == 0) goto L25
            if (r4 == 0) goto L17
            androidx.lifecycle.d0<java.lang.String> r4 = r4.f21464n
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
            com.google.android.material.textfield.TextInputEditText r5 = r9.f15319r
            p347u0.C6282f.m12909b(r5, r4)
        L2d:
            r4 = 4
            long r0 = r0 & r4
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L3b
            com.google.android.material.textfield.TextInputEditText r0 = r9.f15319r
            u0.f$d r1 = r9.f15346B
            p347u0.C6282f.m12910c(r0, r7, r1, r7, r7)
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
            long r0 = r5.f15347C     // Catch: java.lang.Throwable -> Lf
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
            long r3 = r2.f15347C     // Catch: java.lang.Throwable -> L13
            r0 = 1
            long r3 = r3 | r0
            r2.f15347C = r3     // Catch: java.lang.Throwable -> L13
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

    @Override // p171jd.AbstractC3534l2
    /* renamed from: r */
    public void mo8002r(pf.C5498g r5) {
            r4 = this;
            r4.f15327z = r5
            monitor-enter(r4)
            long r0 = r4.f15347C     // Catch: java.lang.Throwable -> L13
            r2 = 2
            long r0 = r0 | r2
            r4.f15347C = r0     // Catch: java.lang.Throwable -> L13
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
