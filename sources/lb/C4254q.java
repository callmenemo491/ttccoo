package lb;

/* renamed from: lb.q */
/* loaded from: classes.dex */
public final class C4254q extends java.lang.Number {

    /* renamed from: Y */
    public final java.lang.String f17435Y;

    public C4254q(java.lang.String r1) {
            r0 = this;
            r0.<init>()
            r0.f17435Y = r1
            return
    }

    @Override // java.lang.Number
    public double doubleValue() {
            r2 = this;
            java.lang.String r0 = r2.f17435Y
            double r0 = java.lang.Double.parseDouble(r0)
            return r0
    }

    public boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 1
            if (r3 != r4) goto L4
            return r0
        L4:
            boolean r1 = r4 instanceof lb.C4254q
            r2 = 0
            if (r1 == 0) goto L1a
            lb.q r4 = (lb.C4254q) r4
            java.lang.String r1 = r3.f17435Y
            java.lang.String r4 = r4.f17435Y
            if (r1 == r4) goto L19
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L18
            goto L19
        L18:
            r0 = 0
        L19:
            return r0
        L1a:
            return r2
    }

    @Override // java.lang.Number
    public float floatValue() {
            r1 = this;
            java.lang.String r0 = r1.f17435Y
            float r0 = java.lang.Float.parseFloat(r0)
            return r0
    }

    public int hashCode() {
            r1 = this;
            java.lang.String r0 = r1.f17435Y
            int r0 = r0.hashCode()
            return r0
    }

    @Override // java.lang.Number
    public int intValue() {
            r2 = this;
            java.lang.String r0 = r2.f17435Y     // Catch: java.lang.NumberFormatException -> L7
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.NumberFormatException -> L7
            return r0
        L7:
            java.lang.String r0 = r2.f17435Y     // Catch: java.lang.NumberFormatException -> Lf
            long r0 = java.lang.Long.parseLong(r0)     // Catch: java.lang.NumberFormatException -> Lf
            int r1 = (int) r0
            return r1
        Lf:
            java.math.BigDecimal r0 = new java.math.BigDecimal
            java.lang.String r1 = r2.f17435Y
            r0.<init>(r1)
            int r0 = r0.intValue()
            return r0
    }

    @Override // java.lang.Number
    public long longValue() {
            r2 = this;
            java.lang.String r0 = r2.f17435Y     // Catch: java.lang.NumberFormatException -> L7
            long r0 = java.lang.Long.parseLong(r0)     // Catch: java.lang.NumberFormatException -> L7
            return r0
        L7:
            java.math.BigDecimal r0 = new java.math.BigDecimal
            java.lang.String r1 = r2.f17435Y
            r0.<init>(r1)
            long r0 = r0.longValue()
            return r0
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = r1.f17435Y
            return r0
    }
}
