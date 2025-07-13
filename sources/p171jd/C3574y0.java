package p171jd;

/* renamed from: jd.y0 */
/* loaded from: classes.dex */
public class C3574y0 extends p171jd.AbstractC3571x0 implements p191kd.C4096a.a {

    /* renamed from: F */
    public static final android.util.SparseIntArray f15659F = null;

    /* renamed from: D */
    public final p347u0.C6282f.d f15660D;

    /* renamed from: E */
    public long f15661E;

    static {
            android.util.SparseIntArray r0 = new android.util.SparseIntArray
            r0.<init>()
            p171jd.C3574y0.f15659F = r0
            r1 = 2131362225(0x7f0a01b1, float:1.8344225E38)
            r2 = 2
            r0.put(r1, r2)
            r1 = 2131362710(0x7f0a0396, float:1.8345208E38)
            r2 = 3
            r0.put(r1, r2)
            r1 = 2131361981(0x7f0a00bd, float:1.834373E38)
            r2 = 4
            r0.put(r1, r2)
            r1 = 2131362230(0x7f0a01b6, float:1.8344235E38)
            r2 = 5
            r0.put(r1, r2)
            r1 = 2131361915(0x7f0a007b, float:1.8343596E38)
            r2 = 6
            r0.put(r1, r2)
            r1 = 2131362490(0x7f0a02ba, float:1.8344762E38)
            r2 = 7
            r0.put(r1, r2)
            r1 = 2131362573(0x7f0a030d, float:1.834493E38)
            r2 = 8
            r0.put(r1, r2)
            r1 = 2131362689(0x7f0a0381, float:1.8345166E38)
            r2 = 9
            r0.put(r1, r2)
            r1 = 2131362690(0x7f0a0382, float:1.8345168E38)
            r2 = 10
            r0.put(r1, r2)
            r1 = 2131361971(0x7f0a00b3, float:1.834371E38)
            r2 = 11
            r0.put(r1, r2)
            return
    }

    public C3574y0(androidx.databinding.InterfaceC0358e r20, android.view.View r21) {
            r19 = this;
            r15 = r19
            r0 = r21
            android.util.SparseIntArray r1 = p171jd.C3574y0.f15659F
            r2 = 12
            r3 = r20
            java.lang.Object[] r16 = androidx.databinding.ViewDataBinding.m1051k(r3, r0, r2, r1)
            r14 = 1
            r1 = r16[r14]
            r5 = r1
            com.google.android.material.textfield.TextInputEditText r5 = (com.google.android.material.textfield.TextInputEditText) r5
            r1 = 6
            r1 = r16[r1]
            r6 = r1
            androidx.appcompat.widget.AppCompatTextView r6 = (androidx.appcompat.widget.AppCompatTextView) r6
            r1 = 11
            r1 = r16[r1]
            r7 = r1
            com.google.android.material.button.MaterialButton r7 = (com.google.android.material.button.MaterialButton) r7
            r1 = 4
            r1 = r16[r1]
            r8 = r1
            androidx.appcompat.widget.AppCompatImageView r8 = (androidx.appcompat.widget.AppCompatImageView) r8
            r1 = 2
            r1 = r16[r1]
            r9 = r1
            com.google.android.material.card.MaterialCardView r9 = (com.google.android.material.card.MaterialCardView) r9
            r1 = 5
            r1 = r16[r1]
            r10 = r1
            androidx.appcompat.widget.AppCompatTextView r10 = (androidx.appcompat.widget.AppCompatTextView) r10
            r1 = 7
            r1 = r16[r1]
            r11 = r1
            androidx.appcompat.widget.AppCompatTextView r11 = (androidx.appcompat.widget.AppCompatTextView) r11
            r1 = 8
            r1 = r16[r1]
            r12 = r1
            androidx.appcompat.widget.AppCompatSeekBar r12 = (androidx.appcompat.widget.AppCompatSeekBar) r12
            r1 = 9
            r1 = r16[r1]
            r13 = r1
            androidx.appcompat.widget.AppCompatTextView r13 = (androidx.appcompat.widget.AppCompatTextView) r13
            r1 = 10
            r1 = r16[r1]
            r17 = r1
            androidx.appcompat.widget.AppCompatTextView r17 = (androidx.appcompat.widget.AppCompatTextView) r17
            r1 = 3
            r1 = r16[r1]
            r18 = r1
            androidx.appcompat.widget.AppCompatTextView r18 = (androidx.appcompat.widget.AppCompatTextView) r18
            r4 = 1
            r1 = r19
            r2 = r20
            r3 = r21
            r14 = r17
            r15 = r18
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r1 = -1
            r3 = r19
            r3.f15661E = r1
            com.google.android.material.textfield.TextInputEditText r1 = r3.f15635r
            r2 = 0
            r1.setTag(r2)
            r1 = 0
            r1 = r16[r1]
            androidx.constraintlayout.widget.ConstraintLayout r1 = (androidx.constraintlayout.widget.ConstraintLayout) r1
            r1.setTag(r2)
            r1 = 2131362083(0x7f0a0123, float:1.8343937E38)
            r0.setTag(r1, r3)
            kd.a r0 = new kd.a
            r1 = 1
            r0.<init>(r3, r1)
            r3.f15660D = r0
            monitor-enter(r19)
            r0 = 4
            r3.f15661E = r0     // Catch: java.lang.Throwable -> L90
            monitor-exit(r19)     // Catch: java.lang.Throwable -> L90
            r19.m1059o()
            return
        L90:
            r0 = move-exception
            monitor-exit(r19)     // Catch: java.lang.Throwable -> L90
            throw r0
    }

    @Override // p191kd.C4096a.a
    /* renamed from: a */
    public final void mo7970a(int r5, java.lang.CharSequence r6, int r7, int r8, int r9) {
            r4 = this;
            oe.h r5 = r4.f15634B
            r7 = 0
            if (r5 == 0) goto L7
            r8 = 1
            goto L8
        L7:
            r8 = 0
        L8:
            if (r8 == 0) goto L50
            java.util.Objects.requireNonNull(r5)
            java.lang.String r8 = "charSequence"
            p214m2.C4339q.m9706k(r6, r8)
            java.lang.String r6 = r6.toString()
            androidx.lifecycle.d0<java.lang.String> r8 = r5.f20381i
            java.lang.Object r8 = r8.m1411d()
            boolean r8 = p214m2.C4339q.m9702c(r6, r8)
            if (r8 == 0) goto L23
            goto L50
        L23:
            java.lang.Double r8 = p362uh.C6462h.m13048E(r6)
            me.c r9 = r5.m11511d()
            if (r8 != 0) goto L32
            androidx.lifecycle.d0<java.lang.String> r5 = r5.f20381i
            java.lang.String r6 = ""
            goto L4d
        L32:
            double r0 = r8.doubleValue()
            double r2 = r9.getTotalMySupplyAmount()
            int r8 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            androidx.lifecycle.d0<java.lang.String> r5 = r5.f20381i
            if (r8 <= 0) goto L4d
            double r0 = r9.getTotalMySupplyAmount()
            int r6 = r9.getPrecision()
            r8 = 2
            java.lang.String r6 = vg.C6672m.m13535v(r0, r6, r7, r8)
        L4d:
            r5.mo7l(r6)
        L50:
            return
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: e */
    public void mo1054e() {
            r9 = this;
            monitor-enter(r9)
            long r0 = r9.f15661E     // Catch: java.lang.Throwable -> L3c
            r2 = 0
            r9.f15661E = r2     // Catch: java.lang.Throwable -> L3c
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L3c
            oe.h r4 = r9.f15634B
            r5 = 7
            long r5 = r5 & r0
            r7 = 0
            int r8 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r8 == 0) goto L25
            if (r4 == 0) goto L17
            androidx.lifecycle.d0<java.lang.String> r4 = r4.f20381i
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
            com.google.android.material.textfield.TextInputEditText r5 = r9.f15635r
            p347u0.C6282f.m12909b(r5, r4)
        L2d:
            r4 = 4
            long r0 = r0 & r4
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L3b
            com.google.android.material.textfield.TextInputEditText r0 = r9.f15635r
            u0.f$d r1 = r9.f15660D
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
            long r0 = r5.f15661E     // Catch: java.lang.Throwable -> Lf
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
            long r3 = r2.f15661E     // Catch: java.lang.Throwable -> L13
            r0 = 1
            long r3 = r3 | r0
            r2.f15661E = r3     // Catch: java.lang.Throwable -> L13
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

    @Override // p171jd.AbstractC3571x0
    /* renamed from: r */
    public void mo8014r(p256oe.C5246h r5) {
            r4 = this;
            r4.f15634B = r5
            monitor-enter(r4)
            long r0 = r4.f15661E     // Catch: java.lang.Throwable -> L13
            r2 = 2
            long r0 = r0 | r2
            r4.f15661E = r0     // Catch: java.lang.Throwable -> L13
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
