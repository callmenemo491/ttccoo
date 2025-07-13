package p456ze;

/* renamed from: ze.d */
/* loaded from: classes.dex */
public final class C7311d {
    private final java.lang.String access;
    private final java.lang.String creator;
    private final int end_time;
    private final int last_tranche_id;
    private final long last_tranche_time;
    private final java.lang.String mine;
    private final java.lang.String mine_desc;
    private final java.lang.String mine_name;
    private final long start_time;
    private final long started;
    private final p456ze.C7311d.a total_mining;

    /* renamed from: ze.d$a */
    public static final class a {
        private final java.lang.String contract;
        private final java.lang.String quantity;

        public a(java.lang.String r2, java.lang.String r3) {
                r1 = this;
                java.lang.String r0 = "contract"
                p214m2.C4339q.m9706k(r2, r0)
                java.lang.String r0 = "quantity"
                p214m2.C4339q.m9706k(r3, r0)
                r1.<init>()
                r1.contract = r2
                r1.quantity = r3
                return
        }

        public static /* synthetic */ p456ze.C7311d.a copy$default(p456ze.C7311d.a r0, java.lang.String r1, java.lang.String r2, int r3, java.lang.Object r4) {
                r4 = r3 & 1
                if (r4 == 0) goto L6
                java.lang.String r1 = r0.contract
            L6:
                r3 = r3 & 2
                if (r3 == 0) goto Lc
                java.lang.String r2 = r0.quantity
            Lc:
                ze.d$a r0 = r0.copy(r1, r2)
                return r0
        }

        public final java.lang.String component1() {
                r1 = this;
                java.lang.String r0 = r1.contract
                return r0
        }

        public final java.lang.String component2() {
                r1 = this;
                java.lang.String r0 = r1.quantity
                return r0
        }

        public final p456ze.C7311d.a copy(java.lang.String r2, java.lang.String r3) {
                r1 = this;
                java.lang.String r0 = "contract"
                p214m2.C4339q.m9706k(r2, r0)
                java.lang.String r0 = "quantity"
                p214m2.C4339q.m9706k(r3, r0)
                ze.d$a r0 = new ze.d$a
                r0.<init>(r2, r3)
                return r0
        }

        public boolean equals(java.lang.Object r5) {
                r4 = this;
                r0 = 1
                if (r4 != r5) goto L4
                return r0
            L4:
                boolean r1 = r5 instanceof p456ze.C7311d.a
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                ze.d$a r5 = (p456ze.C7311d.a) r5
                java.lang.String r1 = r4.contract
                java.lang.String r3 = r5.contract
                boolean r1 = p214m2.C4339q.m9702c(r1, r3)
                if (r1 != 0) goto L17
                return r2
            L17:
                java.lang.String r1 = r4.quantity
                java.lang.String r5 = r5.quantity
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

        public final double getQuantityValue() {
                r4 = this;
                java.lang.String r0 = r4.quantity
                java.lang.String r1 = " "
                java.lang.String[] r1 = new java.lang.String[]{r1}
                r2 = 0
                r3 = 6
                java.util.List r0 = p362uh.C6467m.m13080k0(r0, r1, r2, r2, r3)
                java.lang.Object r0 = p062dh.C1473i.m3995G(r0)
                java.lang.String r0 = (java.lang.String) r0
                double r0 = java.lang.Double.parseDouble(r0)
                return r0
        }

        public int hashCode() {
                r2 = this;
                java.lang.String r0 = r2.contract
                int r0 = r0.hashCode()
                int r0 = r0 * 31
                java.lang.String r1 = r2.quantity
                int r1 = r1.hashCode()
                int r1 = r1 + r0
                return r1
        }

        public java.lang.String toString() {
                r3 = this;
                java.lang.String r0 = "TotalMining(contract="
                java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
                java.lang.String r1 = r3.contract
                r0.append(r1)
                java.lang.String r1 = ", quantity="
                r0.append(r1)
                java.lang.String r1 = r3.quantity
                r2 = 41
                java.lang.String r0 = p185k7.C3814g5.m8552a(r0, r1, r2)
                return r0
        }
    }

    public C7311d(java.lang.String r2, java.lang.String r3, int r4, int r5, long r6, java.lang.String r8, java.lang.String r9, java.lang.String r10, long r11, long r13, p456ze.C7311d.a r15) {
            r1 = this;
            java.lang.String r0 = "access"
            p214m2.C4339q.m9706k(r2, r0)
            java.lang.String r0 = "creator"
            p214m2.C4339q.m9706k(r3, r0)
            java.lang.String r0 = "mine"
            p214m2.C4339q.m9706k(r8, r0)
            java.lang.String r0 = "mine_desc"
            p214m2.C4339q.m9706k(r9, r0)
            java.lang.String r0 = "mine_name"
            p214m2.C4339q.m9706k(r10, r0)
            java.lang.String r0 = "total_mining"
            p214m2.C4339q.m9706k(r15, r0)
            r1.<init>()
            r1.access = r2
            r1.creator = r3
            r1.end_time = r4
            r1.last_tranche_id = r5
            r1.last_tranche_time = r6
            r1.mine = r8
            r1.mine_desc = r9
            r1.mine_name = r10
            r1.start_time = r11
            r1.started = r13
            r1.total_mining = r15
            return
    }

    public static /* synthetic */ p456ze.C7311d copy$default(p456ze.C7311d r15, java.lang.String r16, java.lang.String r17, int r18, int r19, long r20, java.lang.String r22, java.lang.String r23, java.lang.String r24, long r25, long r27, p456ze.C7311d.a r29, int r30, java.lang.Object r31) {
            r0 = r15
            r1 = r30
            r2 = r1 & 1
            if (r2 == 0) goto La
            java.lang.String r2 = r0.access
            goto Lc
        La:
            r2 = r16
        Lc:
            r3 = r1 & 2
            if (r3 == 0) goto L13
            java.lang.String r3 = r0.creator
            goto L15
        L13:
            r3 = r17
        L15:
            r4 = r1 & 4
            if (r4 == 0) goto L1c
            int r4 = r0.end_time
            goto L1e
        L1c:
            r4 = r18
        L1e:
            r5 = r1 & 8
            if (r5 == 0) goto L25
            int r5 = r0.last_tranche_id
            goto L27
        L25:
            r5 = r19
        L27:
            r6 = r1 & 16
            if (r6 == 0) goto L2e
            long r6 = r0.last_tranche_time
            goto L30
        L2e:
            r6 = r20
        L30:
            r8 = r1 & 32
            if (r8 == 0) goto L37
            java.lang.String r8 = r0.mine
            goto L39
        L37:
            r8 = r22
        L39:
            r9 = r1 & 64
            if (r9 == 0) goto L40
            java.lang.String r9 = r0.mine_desc
            goto L42
        L40:
            r9 = r23
        L42:
            r10 = r1 & 128(0x80, float:1.8E-43)
            if (r10 == 0) goto L49
            java.lang.String r10 = r0.mine_name
            goto L4b
        L49:
            r10 = r24
        L4b:
            r11 = r1 & 256(0x100, float:3.59E-43)
            if (r11 == 0) goto L52
            long r11 = r0.start_time
            goto L54
        L52:
            r11 = r25
        L54:
            r13 = r1 & 512(0x200, float:7.17E-43)
            if (r13 == 0) goto L5b
            long r13 = r0.started
            goto L5d
        L5b:
            r13 = r27
        L5d:
            r1 = r1 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L64
            ze.d$a r1 = r0.total_mining
            goto L66
        L64:
            r1 = r29
        L66:
            r16 = r2
            r17 = r3
            r18 = r4
            r19 = r5
            r20 = r6
            r22 = r8
            r23 = r9
            r24 = r10
            r25 = r11
            r27 = r13
            r29 = r1
            ze.d r0 = r15.copy(r16, r17, r18, r19, r20, r22, r23, r24, r25, r27, r29)
            return r0
    }

    public final java.lang.String component1() {
            r1 = this;
            java.lang.String r0 = r1.access
            return r0
    }

    public final long component10() {
            r2 = this;
            long r0 = r2.started
            return r0
    }

    public final p456ze.C7311d.a component11() {
            r1 = this;
            ze.d$a r0 = r1.total_mining
            return r0
    }

    public final java.lang.String component2() {
            r1 = this;
            java.lang.String r0 = r1.creator
            return r0
    }

    public final int component3() {
            r1 = this;
            int r0 = r1.end_time
            return r0
    }

    public final int component4() {
            r1 = this;
            int r0 = r1.last_tranche_id
            return r0
    }

    public final long component5() {
            r2 = this;
            long r0 = r2.last_tranche_time
            return r0
    }

    public final java.lang.String component6() {
            r1 = this;
            java.lang.String r0 = r1.mine
            return r0
    }

    public final java.lang.String component7() {
            r1 = this;
            java.lang.String r0 = r1.mine_desc
            return r0
    }

    public final java.lang.String component8() {
            r1 = this;
            java.lang.String r0 = r1.mine_name
            return r0
    }

    public final long component9() {
            r2 = this;
            long r0 = r2.start_time
            return r0
    }

    public final p456ze.C7311d copy(java.lang.String r17, java.lang.String r18, int r19, int r20, long r21, java.lang.String r23, java.lang.String r24, java.lang.String r25, long r26, long r28, p456ze.C7311d.a r30) {
            r16 = this;
            java.lang.String r0 = "access"
            r2 = r17
            p214m2.C4339q.m9706k(r2, r0)
            java.lang.String r0 = "creator"
            r3 = r18
            p214m2.C4339q.m9706k(r3, r0)
            java.lang.String r0 = "mine"
            r8 = r23
            p214m2.C4339q.m9706k(r8, r0)
            java.lang.String r0 = "mine_desc"
            r9 = r24
            p214m2.C4339q.m9706k(r9, r0)
            java.lang.String r0 = "mine_name"
            r10 = r25
            p214m2.C4339q.m9706k(r10, r0)
            java.lang.String r0 = "total_mining"
            r15 = r30
            p214m2.C4339q.m9706k(r15, r0)
            ze.d r0 = new ze.d
            r1 = r0
            r4 = r19
            r5 = r20
            r6 = r21
            r11 = r26
            r13 = r28
            r1.<init>(r2, r3, r4, r5, r6, r8, r9, r10, r11, r13, r15)
            return r0
    }

    public boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof p456ze.C7311d
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            ze.d r8 = (p456ze.C7311d) r8
            java.lang.String r1 = r7.access
            java.lang.String r3 = r8.access
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.String r1 = r7.creator
            java.lang.String r3 = r8.creator
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            int r1 = r7.end_time
            int r3 = r8.end_time
            if (r1 == r3) goto L29
            return r2
        L29:
            int r1 = r7.last_tranche_id
            int r3 = r8.last_tranche_id
            if (r1 == r3) goto L30
            return r2
        L30:
            long r3 = r7.last_tranche_time
            long r5 = r8.last_tranche_time
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto L39
            return r2
        L39:
            java.lang.String r1 = r7.mine
            java.lang.String r3 = r8.mine
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L44
            return r2
        L44:
            java.lang.String r1 = r7.mine_desc
            java.lang.String r3 = r8.mine_desc
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L4f
            return r2
        L4f:
            java.lang.String r1 = r7.mine_name
            java.lang.String r3 = r8.mine_name
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L5a
            return r2
        L5a:
            long r3 = r7.start_time
            long r5 = r8.start_time
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto L63
            return r2
        L63:
            long r3 = r7.started
            long r5 = r8.started
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto L6c
            return r2
        L6c:
            ze.d$a r1 = r7.total_mining
            ze.d$a r8 = r8.total_mining
            boolean r8 = p214m2.C4339q.m9702c(r1, r8)
            if (r8 != 0) goto L77
            return r2
        L77:
            return r0
    }

    public final java.lang.String getAccess() {
            r1 = this;
            java.lang.String r0 = r1.access
            return r0
    }

    public final java.lang.String getCreator() {
            r1 = this;
            java.lang.String r0 = r1.creator
            return r0
    }

    public final int getEnd_time() {
            r1 = this;
            int r0 = r1.end_time
            return r0
    }

    public final int getLast_tranche_id() {
            r1 = this;
            int r0 = r1.last_tranche_id
            return r0
    }

    public final long getLast_tranche_time() {
            r2 = this;
            long r0 = r2.last_tranche_time
            return r0
    }

    public final java.lang.String getMine() {
            r1 = this;
            java.lang.String r0 = r1.mine
            return r0
    }

    public final java.lang.String getMine_desc() {
            r1 = this;
            java.lang.String r0 = r1.mine_desc
            return r0
    }

    public final java.lang.String getMine_name() {
            r1 = this;
            java.lang.String r0 = r1.mine_name
            return r0
    }

    public final long getStart_time() {
            r2 = this;
            long r0 = r2.start_time
            return r0
    }

    public final long getStarted() {
            r2 = this;
            long r0 = r2.started
            return r0
    }

    public final p456ze.C7311d.a getTotal_mining() {
            r1 = this;
            ze.d$a r0 = r1.total_mining
            return r0
    }

    public int hashCode() {
            r6 = this;
            java.lang.String r0 = r6.access
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.lang.String r1 = r6.creator
            r2 = 31
            int r0 = p213m1.C4319e.m9651a(r1, r0, r2)
            int r1 = r6.end_time
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r6.last_tranche_id
            int r0 = r0 + r1
            int r0 = r0 * 31
            long r1 = r6.last_tranche_time
            r3 = 32
            long r4 = r1 >>> r3
            long r1 = r1 ^ r4
            int r2 = (int) r1
            int r0 = r0 + r2
            int r0 = r0 * 31
            java.lang.String r1 = r6.mine
            r2 = 31
            int r0 = p213m1.C4319e.m9651a(r1, r0, r2)
            java.lang.String r1 = r6.mine_desc
            int r0 = p213m1.C4319e.m9651a(r1, r0, r2)
            java.lang.String r1 = r6.mine_name
            int r0 = p213m1.C4319e.m9651a(r1, r0, r2)
            long r1 = r6.start_time
            long r4 = r1 >>> r3
            long r1 = r1 ^ r4
            int r2 = (int) r1
            int r0 = r0 + r2
            int r0 = r0 * 31
            long r1 = r6.started
            long r3 = r1 >>> r3
            long r1 = r1 ^ r3
            int r2 = (int) r1
            int r0 = r0 + r2
            int r0 = r0 * 31
            ze.d$a r1 = r6.total_mining
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = "BluDACPool(access="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.lang.String r1 = r3.access
            r0.append(r1)
            java.lang.String r1 = ", creator="
            r0.append(r1)
            java.lang.String r1 = r3.creator
            r0.append(r1)
            java.lang.String r1 = ", end_time="
            r0.append(r1)
            int r1 = r3.end_time
            r0.append(r1)
            java.lang.String r1 = ", last_tranche_id="
            r0.append(r1)
            int r1 = r3.last_tranche_id
            r0.append(r1)
            java.lang.String r1 = ", last_tranche_time="
            r0.append(r1)
            long r1 = r3.last_tranche_time
            r0.append(r1)
            java.lang.String r1 = ", mine="
            r0.append(r1)
            java.lang.String r1 = r3.mine
            r0.append(r1)
            java.lang.String r1 = ", mine_desc="
            r0.append(r1)
            java.lang.String r1 = r3.mine_desc
            r0.append(r1)
            java.lang.String r1 = ", mine_name="
            r0.append(r1)
            java.lang.String r1 = r3.mine_name
            r0.append(r1)
            java.lang.String r1 = ", start_time="
            r0.append(r1)
            long r1 = r3.start_time
            r0.append(r1)
            java.lang.String r1 = ", started="
            r0.append(r1)
            long r1 = r3.started
            r0.append(r1)
            java.lang.String r1 = ", total_mining="
            r0.append(r1)
            ze.d$a r1 = r3.total_mining
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
