package p171jd;

/* renamed from: jd.r0 */
/* loaded from: classes.dex */
public class C3553r0 extends p171jd.AbstractC3550q0 implements p191kd.C4096a.a {

    /* renamed from: C */
    public static final android.util.SparseIntArray f15484C = null;

    /* renamed from: A */
    public final p347u0.C6282f.d f15485A;

    /* renamed from: B */
    public long f15486B;

    static {
            android.util.SparseIntArray r0 = new android.util.SparseIntArray
            r0.<init>()
            p171jd.C3553r0.f15484C = r0
            r1 = 2131362230(0x7f0a01b6, float:1.8344235E38)
            r2 = 3
            r0.put(r1, r2)
            r1 = 2131361915(0x7f0a007b, float:1.8343596E38)
            r2 = 4
            r0.put(r1, r2)
            r1 = 2131362518(0x7f0a02d6, float:1.8344819E38)
            r2 = 5
            r0.put(r1, r2)
            r1 = 2131362191(0x7f0a018f, float:1.8344156E38)
            r2 = 6
            r0.put(r1, r2)
            r1 = 2131361966(0x7f0a00ae, float:1.83437E38)
            r2 = 7
            r0.put(r1, r2)
            r1 = 2131361944(0x7f0a0098, float:1.8343655E38)
            r2 = 8
            r0.put(r1, r2)
            return
    }

    public C3553r0(androidx.databinding.InterfaceC0358e r17, android.view.View r18) {
            r16 = this;
            r13 = r16
            r0 = r18
            android.util.SparseIntArray r1 = p171jd.C3553r0.f15484C
            r2 = 9
            r3 = r17
            java.lang.Object[] r14 = androidx.databinding.ViewDataBinding.m1051k(r3, r0, r2, r1)
            r1 = 4
            r1 = r14[r1]
            r5 = r1
            androidx.appcompat.widget.AppCompatTextView r5 = (androidx.appcompat.widget.AppCompatTextView) r5
            r1 = 8
            r1 = r14[r1]
            r6 = r1
            com.google.android.material.button.MaterialButton r6 = (com.google.android.material.button.MaterialButton) r6
            r1 = 7
            r1 = r14[r1]
            r7 = r1
            com.google.android.material.button.MaterialButton r7 = (com.google.android.material.button.MaterialButton) r7
            r15 = 1
            r1 = r14[r15]
            r8 = r1
            com.google.android.material.textfield.TextInputEditText r8 = (com.google.android.material.textfield.TextInputEditText) r8
            r1 = 6
            r1 = r14[r1]
            r9 = r1
            androidx.appcompat.widget.AppCompatTextView r9 = (androidx.appcompat.widget.AppCompatTextView) r9
            r1 = 3
            r1 = r14[r1]
            r10 = r1
            androidx.appcompat.widget.AppCompatTextView r10 = (androidx.appcompat.widget.AppCompatTextView) r10
            r1 = 5
            r1 = r14[r1]
            r11 = r1
            androidx.appcompat.widget.AppCompatTextView r11 = (androidx.appcompat.widget.AppCompatTextView) r11
            r1 = 2
            r1 = r14[r1]
            r12 = r1
            androidx.appcompat.widget.AppCompatTextView r12 = (androidx.appcompat.widget.AppCompatTextView) r12
            r4 = 2
            r1 = r16
            r2 = r17
            r3 = r18
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r1 = -1
            r13.f15486B = r1
            com.google.android.material.textfield.TextInputEditText r1 = r13.f15444u
            r2 = 0
            r1.setTag(r2)
            r1 = 0
            r1 = r14[r1]
            androidx.appcompat.widget.LinearLayoutCompat r1 = (androidx.appcompat.widget.LinearLayoutCompat) r1
            r1.setTag(r2)
            androidx.appcompat.widget.AppCompatTextView r1 = r13.f15447x
            r1.setTag(r2)
            r1 = 2131362083(0x7f0a0123, float:1.8343937E38)
            r0.setTag(r1, r13)
            kd.a r0 = new kd.a
            r0.<init>(r13, r15)
            r13.f15485A = r0
            monitor-enter(r16)
            r0 = 8
            r13.f15486B = r0     // Catch: java.lang.Throwable -> L77
            monitor-exit(r16)     // Catch: java.lang.Throwable -> L77
            r16.m1059o()
            return
        L77:
            r0 = move-exception
            monitor-exit(r16)     // Catch: java.lang.Throwable -> L77
            throw r0
    }

    @Override // p191kd.C4096a.a
    /* renamed from: a */
    public final void mo7970a(int r5, java.lang.CharSequence r6, int r7, int r8, int r9) {
            r4 = this;
            ke.g r5 = r4.f15448y
            if (r5 == 0) goto L6
            r7 = 1
            goto L7
        L6:
            r7 = 0
        L7:
            if (r7 == 0) goto L4d
            java.util.Objects.requireNonNull(r5)
            java.lang.String r7 = "charSequence"
            p214m2.C4339q.m9706k(r6, r7)
            java.lang.String r6 = r6.toString()
            androidx.lifecycle.d0<java.lang.String> r7 = r5.f17055h
            java.lang.Object r7 = r7.m1411d()
            boolean r7 = p214m2.C4339q.m9702c(r6, r7)
            if (r7 == 0) goto L22
            goto L4d
        L22:
            java.lang.Double r7 = p362uh.C6462h.m13048E(r6)
            androidx.lifecycle.d0<od.b0> r8 = r5.f17053f
            java.lang.Object r8 = r8.m1411d()
            od.b0 r8 = (p255od.C5194b0) r8
            if (r7 == 0) goto L46
            if (r8 != 0) goto L33
            goto L46
        L33:
            double r0 = r7.doubleValue()
            double r2 = r8.getAmount()
            int r7 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            androidx.lifecycle.d0<java.lang.String> r5 = r5.f17055h
            if (r7 <= 0) goto L4a
            java.lang.String r6 = r8.getAmountString()
            goto L4a
        L46:
            androidx.lifecycle.d0<java.lang.String> r5 = r5.f17055h
            java.lang.String r6 = ""
        L4a:
            r5.mo7l(r6)
        L4d:
            return
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: e */
    public void mo1054e() {
            r14 = this;
            monitor-enter(r14)
            long r0 = r14.f15486B     // Catch: java.lang.Throwable -> L70
            r2 = 0
            r14.f15486B = r2     // Catch: java.lang.Throwable -> L70
            monitor-exit(r14)     // Catch: java.lang.Throwable -> L70
            ke.g r4 = r14.f15448y
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
            androidx.lifecycle.LiveData<java.lang.String> r5 = r4.f17060m
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
            androidx.lifecycle.d0<java.lang.String> r4 = r4.f17055h
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
            com.google.android.material.textfield.TextInputEditText r6 = r14.f15444u
            p347u0.C6282f.m12909b(r6, r4)
        L57:
            r9 = 8
            long r9 = r9 & r0
            int r4 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r4 == 0) goto L65
            com.google.android.material.textfield.TextInputEditText r4 = r14.f15444u
            u0.f$d r6 = r14.f15485A
            p347u0.C6282f.m12910c(r4, r11, r6, r11, r11)
        L65:
            long r0 = r0 & r7
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L6f
            androidx.appcompat.widget.AppCompatTextView r0 = r14.f15447x
            p347u0.C6282f.m12909b(r0, r5)
        L6f:
            return
        L70:
            r0 = move-exception
            monitor-exit(r14)     // Catch: java.lang.Throwable -> L70
            throw r0
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: g */
    public boolean mo1056g() {
            r5 = this;
            monitor-enter(r5)
            long r0 = r5.f15486B     // Catch: java.lang.Throwable -> Lf
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
            long r5 = r4.f15486B     // Catch: java.lang.Throwable -> L16
            r2 = 2
            long r5 = r5 | r2
            r4.f15486B = r5     // Catch: java.lang.Throwable -> L16
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
            androidx.lifecycle.LiveData r6 = (androidx.lifecycle.LiveData) r6
            if (r7 != 0) goto L2c
            monitor-enter(r4)
            long r5 = r4.f15486B     // Catch: java.lang.Throwable -> L29
            r2 = 1
            long r5 = r5 | r2
            r4.f15486B = r5     // Catch: java.lang.Throwable -> L29
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

    @Override // p171jd.AbstractC3550q0
    /* renamed from: r */
    public void mo8005r(ke.C4103g r5) {
            r4 = this;
            r4.f15448y = r5
            monitor-enter(r4)
            long r0 = r4.f15486B     // Catch: java.lang.Throwable -> L13
            r2 = 4
            long r0 = r0 | r2
            r4.f15486B = r0     // Catch: java.lang.Throwable -> L13
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
