package p185k7;

/* renamed from: k7.g */
/* loaded from: classes.dex */
public final class C3808g implements p185k7.InterfaceC3916o {

    /* renamed from: Y */
    public final java.lang.Double f16641Y;

    public C3808g(java.lang.Double r3) {
            r2 = this;
            r2.<init>()
            if (r3 != 0) goto Le
            r0 = 9221120237041090560(0x7ff8000000000000, double:NaN)
            java.lang.Double r3 = java.lang.Double.valueOf(r0)
            r2.f16641Y = r3
            return
        Le:
            r2.f16641Y = r3
            return
    }

    @Override // p185k7.InterfaceC3916o
    /* renamed from: e */
    public final java.lang.Boolean mo8353e() {
            r6 = this;
            java.lang.Double r0 = r6.f16641Y
            double r0 = r0.doubleValue()
            boolean r0 = java.lang.Double.isNaN(r0)
            r1 = 0
            if (r0 != 0) goto L1a
            java.lang.Double r0 = r6.f16641Y
            double r2 = r0.doubleValue()
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L1a
            r1 = 1
        L1a:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            return r0
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r2 != r1) goto L4
            r2 = 1
            return r2
        L4:
            boolean r0 = r2 instanceof p185k7.C3808g
            if (r0 != 0) goto La
            r2 = 0
            return r2
        La:
            k7.g r2 = (p185k7.C3808g) r2
            java.lang.Double r0 = r1.f16641Y
            java.lang.Double r2 = r2.f16641Y
            boolean r2 = r0.equals(r2)
            return r2
    }

    @Override // p185k7.InterfaceC3916o
    /* renamed from: f */
    public final p185k7.InterfaceC3916o mo8354f() {
            r2 = this;
            k7.g r0 = new k7.g
            java.lang.Double r1 = r2.f16641Y
            r0.<init>(r1)
            return r0
    }

    @Override // p185k7.InterfaceC3916o
    /* renamed from: g */
    public final java.lang.Double mo8355g() {
            r1 = this;
            java.lang.Double r0 = r1.f16641Y
            return r0
    }

    public final int hashCode() {
            r1 = this;
            java.lang.Double r0 = r1.f16641Y
            int r0 = r0.hashCode()
            return r0
    }

    @Override // p185k7.InterfaceC3916o
    /* renamed from: i */
    public final java.lang.String mo8357i() {
            r5 = this;
            java.lang.Double r0 = r5.f16641Y
            double r0 = r0.doubleValue()
            boolean r0 = java.lang.Double.isNaN(r0)
            if (r0 == 0) goto Lf
            java.lang.String r0 = "NaN"
            return r0
        Lf:
            java.lang.Double r0 = r5.f16641Y
            double r0 = r0.doubleValue()
            boolean r0 = java.lang.Double.isInfinite(r0)
            if (r0 == 0) goto L2d
            java.lang.Double r0 = r5.f16641Y
            double r0 = r0.doubleValue()
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L2a
            java.lang.String r0 = "Infinity"
            return r0
        L2a:
            java.lang.String r0 = "-Infinity"
            return r0
        L2d:
            java.lang.Double r0 = r5.f16641Y
            double r0 = r0.doubleValue()
            java.math.BigDecimal r0 = java.math.BigDecimal.valueOf(r0)
            java.math.BigDecimal r0 = r0.stripTrailingZeros()
            java.text.DecimalFormat r1 = new java.text.DecimalFormat
            java.lang.String r2 = "0E0"
            r1.<init>(r2)
            java.math.RoundingMode r2 = java.math.RoundingMode.HALF_UP
            r1.setRoundingMode(r2)
            int r2 = r0.scale()
            if (r2 <= 0) goto L52
            int r2 = r0.precision()
            goto L56
        L52:
            int r2 = r0.scale()
        L56:
            int r2 = r2 + (-1)
            r1.setMinimumFractionDigits(r2)
            java.lang.String r1 = r1.format(r0)
            java.lang.String r2 = "E"
            int r3 = r1.indexOf(r2)
            if (r3 <= 0) goto L8f
            int r3 = r3 + 1
            java.lang.String r3 = r1.substring(r3)
            int r3 = java.lang.Integer.parseInt(r3)
            if (r3 >= 0) goto L76
            r4 = -7
            if (r3 > r4) goto L7c
        L76:
            if (r3 < 0) goto L81
            r4 = 21
            if (r3 >= r4) goto L81
        L7c:
            java.lang.String r1 = r0.toPlainString()
            goto L8f
        L81:
            java.lang.String r0 = "E-"
            java.lang.String r3 = "e-"
            java.lang.String r0 = r1.replace(r0, r3)
            java.lang.String r1 = "e+"
            java.lang.String r1 = r0.replace(r2, r1)
        L8f:
            return r1
    }

    @Override // p185k7.InterfaceC3916o
    /* renamed from: n */
    public final java.util.Iterator<p185k7.InterfaceC3916o> mo8360n() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // p185k7.InterfaceC3916o
    /* renamed from: p */
    public final p185k7.InterfaceC3916o mo8361p(java.lang.String r3, p365v.C6476c r4, java.util.List<p185k7.InterfaceC3916o> r5) {
            r2 = this;
            java.lang.String r4 = "toString"
            boolean r4 = r4.equals(r3)
            if (r4 == 0) goto L12
            k7.r r3 = new k7.r
            java.lang.String r4 = r2.mo8357i()
            r3.<init>(r4)
            return r3
        L12:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            r5 = 2
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r0 = 0
            java.lang.String r1 = r2.mo8357i()
            r5[r0] = r1
            r0 = 1
            r5[r0] = r3
            java.lang.String r3 = "%s.%s is not a function."
            java.lang.String r3 = java.lang.String.format(r3, r5)
            r4.<init>(r3)
            throw r4
    }

    public final java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = r1.mo8357i()
            return r0
    }
}
