package p255od;

/* renamed from: od.d0 */
/* loaded from: classes.dex */
public final class C5198d0 {

    /* renamed from: id */
    private final java.lang.String f20344id;
    private final p255od.C5198d0.a pool1;
    private final p255od.C5198d0.a pool2;
    private final java.lang.String supply;

    /* renamed from: od.d0$a */
    public static final class a {
        private final java.lang.String contract;
        private final java.lang.String quantity;

        public a(java.lang.String r2, java.lang.String r3) {
                r1 = this;
                java.lang.String r0 = "quantity"
                p214m2.C4339q.m9706k(r2, r0)
                java.lang.String r0 = "contract"
                p214m2.C4339q.m9706k(r3, r0)
                r1.<init>()
                r1.quantity = r2
                r1.contract = r3
                return
        }

        public static /* synthetic */ p255od.C5198d0.a copy$default(p255od.C5198d0.a r0, java.lang.String r1, java.lang.String r2, int r3, java.lang.Object r4) {
                r4 = r3 & 1
                if (r4 == 0) goto L6
                java.lang.String r1 = r0.quantity
            L6:
                r3 = r3 & 2
                if (r3 == 0) goto Lc
                java.lang.String r2 = r0.contract
            Lc:
                od.d0$a r0 = r0.copy(r1, r2)
                return r0
        }

        public final java.lang.String component1() {
                r1 = this;
                java.lang.String r0 = r1.quantity
                return r0
        }

        public final java.lang.String component2() {
                r1 = this;
                java.lang.String r0 = r1.contract
                return r0
        }

        public final p255od.C5198d0.a copy(java.lang.String r2, java.lang.String r3) {
                r1 = this;
                java.lang.String r0 = "quantity"
                p214m2.C4339q.m9706k(r2, r0)
                java.lang.String r0 = "contract"
                p214m2.C4339q.m9706k(r3, r0)
                od.d0$a r0 = new od.d0$a
                r0.<init>(r2, r3)
                return r0
        }

        public boolean equals(java.lang.Object r5) {
                r4 = this;
                r0 = 1
                if (r4 != r5) goto L4
                return r0
            L4:
                boolean r1 = r5 instanceof p255od.C5198d0.a
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                od.d0$a r5 = (p255od.C5198d0.a) r5
                java.lang.String r1 = r4.quantity
                java.lang.String r3 = r5.quantity
                boolean r1 = p214m2.C4339q.m9702c(r1, r3)
                if (r1 != 0) goto L17
                return r2
            L17:
                java.lang.String r1 = r4.contract
                java.lang.String r5 = r5.contract
                boolean r5 = p214m2.C4339q.m9702c(r1, r5)
                if (r5 != 0) goto L22
                return r2
            L22:
                return r0
        }

        public final java.lang.String getContract() {
                r1 = this;
                java.lang.String r0 = r1.contract
                return r0
        }

        public final java.lang.String getQuantity() {
                r1 = this;
                java.lang.String r0 = r1.quantity
                return r0
        }

        public int hashCode() {
                r2 = this;
                java.lang.String r0 = r2.quantity
                int r0 = r0.hashCode()
                int r0 = r0 * 31
                java.lang.String r1 = r2.contract
                int r1 = r1.hashCode()
                int r1 = r1 + r0
                return r1
        }

        public java.lang.String toString() {
                r3 = this;
                java.lang.String r0 = "Pool(quantity="
                java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
                java.lang.String r1 = r3.quantity
                r0.append(r1)
                java.lang.String r1 = ", contract="
                r0.append(r1)
                java.lang.String r1 = r3.contract
                r2 = 41
                java.lang.String r0 = p185k7.C3814g5.m8552a(r0, r1, r2)
                return r0
        }
    }

    public C5198d0(java.lang.String r2, java.lang.String r3, p255od.C5198d0.a r4, p255od.C5198d0.a r5) {
            r1 = this;
            java.lang.String r0 = "id"
            p214m2.C4339q.m9706k(r2, r0)
            java.lang.String r0 = "supply"
            p214m2.C4339q.m9706k(r3, r0)
            java.lang.String r0 = "pool1"
            p214m2.C4339q.m9706k(r4, r0)
            java.lang.String r0 = "pool2"
            p214m2.C4339q.m9706k(r5, r0)
            r1.<init>()
            r1.f20344id = r2
            r1.supply = r3
            r1.pool1 = r4
            r1.pool2 = r5
            return
    }

    public static /* synthetic */ p255od.C5198d0 copy$default(p255od.C5198d0 r0, java.lang.String r1, java.lang.String r2, p255od.C5198d0.a r3, p255od.C5198d0.a r4, int r5, java.lang.Object r6) {
            r6 = r5 & 1
            if (r6 == 0) goto L6
            java.lang.String r1 = r0.f20344id
        L6:
            r6 = r5 & 2
            if (r6 == 0) goto Lc
            java.lang.String r2 = r0.supply
        Lc:
            r6 = r5 & 4
            if (r6 == 0) goto L12
            od.d0$a r3 = r0.pool1
        L12:
            r5 = r5 & 8
            if (r5 == 0) goto L18
            od.d0$a r4 = r0.pool2
        L18:
            od.d0 r0 = r0.copy(r1, r2, r3, r4)
            return r0
    }

    public final java.lang.String component1() {
            r1 = this;
            java.lang.String r0 = r1.f20344id
            return r0
    }

    public final java.lang.String component2() {
            r1 = this;
            java.lang.String r0 = r1.supply
            return r0
    }

    public final p255od.C5198d0.a component3() {
            r1 = this;
            od.d0$a r0 = r1.pool1
            return r0
    }

    public final p255od.C5198d0.a component4() {
            r1 = this;
            od.d0$a r0 = r1.pool2
            return r0
    }

    public final p255od.C5198d0 copy(java.lang.String r2, java.lang.String r3, p255od.C5198d0.a r4, p255od.C5198d0.a r5) {
            r1 = this;
            java.lang.String r0 = "id"
            p214m2.C4339q.m9706k(r2, r0)
            java.lang.String r0 = "supply"
            p214m2.C4339q.m9706k(r3, r0)
            java.lang.String r0 = "pool1"
            p214m2.C4339q.m9706k(r4, r0)
            java.lang.String r0 = "pool2"
            p214m2.C4339q.m9706k(r5, r0)
            od.d0 r0 = new od.d0
            r0.<init>(r2, r3, r4, r5)
            return r0
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof p255od.C5198d0
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            od.d0 r5 = (p255od.C5198d0) r5
            java.lang.String r1 = r4.f20344id
            java.lang.String r3 = r5.f20344id
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.String r1 = r4.supply
            java.lang.String r3 = r5.supply
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            od.d0$a r1 = r4.pool1
            od.d0$a r3 = r5.pool1
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L2d
            return r2
        L2d:
            od.d0$a r1 = r4.pool2
            od.d0$a r5 = r5.pool2
            boolean r5 = p214m2.C4339q.m9702c(r1, r5)
            if (r5 != 0) goto L38
            return r2
        L38:
            return r0
    }

    public final java.lang.String getId() {
            r1 = this;
            java.lang.String r0 = r1.f20344id
            return r0
    }

    public final p255od.C5198d0.a getPool1() {
            r1 = this;
            od.d0$a r0 = r1.pool1
            return r0
    }

    public final p255od.C5198d0.a getPool2() {
            r1 = this;
            od.d0$a r0 = r1.pool2
            return r0
    }

    public final java.lang.String getSupply() {
            r1 = this;
            java.lang.String r0 = r1.supply
            return r0
    }

    public int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.f20344id
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.lang.String r1 = r3.supply
            r2 = 31
            int r0 = p213m1.C4319e.m9651a(r1, r0, r2)
            od.d0$a r1 = r3.pool1
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            od.d0$a r0 = r3.pool2
            int r0 = r0.hashCode()
            int r0 = r0 + r1
            return r0
    }

    public final p255od.C5238z toMarket() {
            r19 = this;
            r0 = r19
            od.d0$a r1 = r0.pool1
            java.lang.String r1 = r1.getQuantity()
            java.lang.String r2 = " "
            java.lang.String[] r3 = new java.lang.String[]{r2}
            r4 = 0
            r5 = 6
            java.util.List r1 = p362uh.C6467m.m13080k0(r1, r3, r4, r4, r5)
            java.lang.Object r1 = p062dh.C1473i.m3996H(r1)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L27
            java.lang.Double r1 = p362uh.C6462h.m13048E(r1)
            if (r1 == 0) goto L27
            double r6 = r1.doubleValue()
            goto L29
        L27:
            r6 = 0
        L29:
            od.d0$a r1 = r0.pool2
            java.lang.String r1 = r1.getQuantity()
            java.lang.String[] r3 = new java.lang.String[]{r2}
            java.util.List r1 = p362uh.C6467m.m13080k0(r1, r3, r4, r4, r5)
            java.lang.Object r1 = p062dh.C1473i.m3996H(r1)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L4a
            java.lang.Double r1 = p362uh.C6462h.m13048E(r1)
            if (r1 == 0) goto L4a
            double r8 = r1.doubleValue()
            goto L4c
        L4a:
            r8 = 4607182418800017408(0x3ff0000000000000, double:1.0)
        L4c:
            r14 = r8
            od.d0$a r1 = r0.pool1
            java.lang.String r1 = r1.getQuantity()
            java.lang.String[] r3 = new java.lang.String[]{r2}
            java.util.List r1 = p362uh.C6467m.m13080k0(r1, r3, r4, r4, r5)
            java.lang.Object r1 = p062dh.C1473i.m4002N(r1)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r3 = ""
            if (r1 != 0) goto L66
            r1 = r3
        L66:
            od.d0$a r8 = r0.pool2
            java.lang.String r8 = r8.getQuantity()
            java.lang.String[] r9 = new java.lang.String[]{r2}
            java.util.List r8 = p362uh.C6467m.m13080k0(r8, r9, r4, r4, r5)
            java.lang.Object r8 = p062dh.C1473i.m4002N(r8)
            java.lang.String r8 = (java.lang.String) r8
            if (r8 != 0) goto L7d
            r8 = r3
        L7d:
            od.d0$a r9 = r0.pool1
            java.lang.String r9 = r9.getQuantity()
            java.lang.String r10 = "."
            r11 = 2
            boolean r12 = p362uh.C6467m.m13064U(r9, r10, r4, r11)
            if (r12 == 0) goto Lb1
            java.lang.String[] r12 = new java.lang.String[]{r2}
            java.util.List r9 = p362uh.C6467m.m13080k0(r9, r12, r4, r4, r5)
            java.lang.Object r9 = p062dh.C1473i.m3996H(r9)
            java.lang.String r9 = (java.lang.String) r9
            if (r9 == 0) goto Lb1
            java.lang.String[] r12 = new java.lang.String[]{r10}
            java.util.List r9 = p362uh.C6467m.m13080k0(r9, r12, r4, r4, r5)
            java.lang.Object r9 = p062dh.C1473i.m4002N(r9)
            java.lang.String r9 = (java.lang.String) r9
            if (r9 == 0) goto Lb1
            int r9 = r9.length()
            goto Lb2
        Lb1:
            r9 = 0
        Lb2:
            od.d0$a r12 = r0.pool2
            java.lang.String r12 = r12.getQuantity()
            boolean r11 = p362uh.C6467m.m13064U(r12, r10, r4, r11)
            if (r11 == 0) goto Le2
            java.lang.String[] r2 = new java.lang.String[]{r2}
            java.util.List r2 = p362uh.C6467m.m13080k0(r12, r2, r4, r4, r5)
            java.lang.Object r2 = p062dh.C1473i.m3996H(r2)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto Le2
            java.lang.String[] r10 = new java.lang.String[]{r10}
            java.util.List r2 = p362uh.C6467m.m13080k0(r2, r10, r4, r4, r5)
            java.lang.Object r2 = p062dh.C1473i.m4002N(r2)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto Le2
            int r4 = r2.length()
        Le2:
            od.o0 r2 = new od.o0
            r2.<init>(r1, r9)
            od.o0 r1 = new od.o0
            r1.<init>(r8, r4)
            od.s r4 = new od.s
            od.d0$a r5 = r0.pool1
            java.lang.String r5 = r5.getContract()
            r4.<init>(r5, r2, r3)
            od.s r11 = new od.s
            od.d0$a r2 = r0.pool2
            java.lang.String r2 = r2.getContract()
            r11.<init>(r2, r1, r3)
            boolean r1 = r11.isWax()
            if (r1 == 0) goto L119
            od.z r1 = new od.z
            java.lang.String r9 = r0.f20344id
            double r16 = r14 / r6
            java.lang.Boolean r18 = java.lang.Boolean.TRUE
            r8 = r1
            r10 = r11
            r11 = r4
            r12 = r14
            r14 = r6
            r8.<init>(r9, r10, r11, r12, r14, r16, r18)
            return r1
        L119:
            od.z r1 = new od.z
            java.lang.String r9 = r0.f20344id
            double r16 = r6 / r14
            java.lang.Boolean r18 = java.lang.Boolean.FALSE
            r8 = r1
            r10 = r4
            r12 = r6
            r8.<init>(r9, r10, r11, r12, r14, r16, r18)
            return r1
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = "PairSwapRow(id="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.lang.String r1 = r2.f20344id
            r0.append(r1)
            java.lang.String r1 = ", supply="
            r0.append(r1)
            java.lang.String r1 = r2.supply
            r0.append(r1)
            java.lang.String r1 = ", pool1="
            r0.append(r1)
            od.d0$a r1 = r2.pool1
            r0.append(r1)
            java.lang.String r1 = ", pool2="
            r0.append(r1)
            od.d0$a r1 = r2.pool2
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
