package p255od;

/* renamed from: od.e */
/* loaded from: classes.dex */
public final class C5199e {
    private final java.lang.String asset_id;
    private final java.lang.String contract;
    private final java.lang.String name;
    private final p255od.C5199e.a template;

    /* renamed from: od.e$a */
    public static final class a {
        private final java.lang.String template_id;

        public a(java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = "template_id"
                p214m2.C4339q.m9706k(r2, r0)
                r1.<init>()
                r1.template_id = r2
                return
        }

        public static /* synthetic */ p255od.C5199e.a copy$default(p255od.C5199e.a r0, java.lang.String r1, int r2, java.lang.Object r3) {
                r2 = r2 & 1
                if (r2 == 0) goto L6
                java.lang.String r1 = r0.template_id
            L6:
                od.e$a r0 = r0.copy(r1)
                return r0
        }

        public final java.lang.String component1() {
                r1 = this;
                java.lang.String r0 = r1.template_id
                return r0
        }

        public final p255od.C5199e.a copy(java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = "template_id"
                p214m2.C4339q.m9706k(r2, r0)
                od.e$a r0 = new od.e$a
                r0.<init>(r2)
                return r0
        }

        public boolean equals(java.lang.Object r4) {
                r3 = this;
                r0 = 1
                if (r3 != r4) goto L4
                return r0
            L4:
                boolean r1 = r4 instanceof p255od.C5199e.a
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                od.e$a r4 = (p255od.C5199e.a) r4
                java.lang.String r1 = r3.template_id
                java.lang.String r4 = r4.template_id
                boolean r4 = p214m2.C4339q.m9702c(r1, r4)
                if (r4 != 0) goto L17
                return r2
            L17:
                return r0
        }

        public final java.lang.String getTemplate_id() {
                r1 = this;
                java.lang.String r0 = r1.template_id
                return r0
        }

        public int hashCode() {
                r1 = this;
                java.lang.String r0 = r1.template_id
                int r0 = r0.hashCode()
                return r0
        }

        public java.lang.String toString() {
                r3 = this;
                java.lang.String r0 = "Template(template_id="
                java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
                java.lang.String r1 = r3.template_id
                r2 = 41
                java.lang.String r0 = p185k7.C3814g5.m8552a(r0, r1, r2)
                return r0
        }
    }

    public C5199e(java.lang.String r2, java.lang.String r3, java.lang.String r4, p255od.C5199e.a r5) {
            r1 = this;
            java.lang.String r0 = "asset_id"
            p214m2.C4339q.m9706k(r2, r0)
            java.lang.String r0 = "name"
            p214m2.C4339q.m9706k(r3, r0)
            java.lang.String r0 = "contract"
            p214m2.C4339q.m9706k(r4, r0)
            java.lang.String r0 = "template"
            p214m2.C4339q.m9706k(r5, r0)
            r1.<init>()
            r1.asset_id = r2
            r1.name = r3
            r1.contract = r4
            r1.template = r5
            return
    }

    public static /* synthetic */ p255od.C5199e copy$default(p255od.C5199e r0, java.lang.String r1, java.lang.String r2, java.lang.String r3, p255od.C5199e.a r4, int r5, java.lang.Object r6) {
            r6 = r5 & 1
            if (r6 == 0) goto L6
            java.lang.String r1 = r0.asset_id
        L6:
            r6 = r5 & 2
            if (r6 == 0) goto Lc
            java.lang.String r2 = r0.name
        Lc:
            r6 = r5 & 4
            if (r6 == 0) goto L12
            java.lang.String r3 = r0.contract
        L12:
            r5 = r5 & 8
            if (r5 == 0) goto L18
            od.e$a r4 = r0.template
        L18:
            od.e r0 = r0.copy(r1, r2, r3, r4)
            return r0
    }

    public final java.lang.String component1() {
            r1 = this;
            java.lang.String r0 = r1.asset_id
            return r0
    }

    public final java.lang.String component2() {
            r1 = this;
            java.lang.String r0 = r1.name
            return r0
    }

    public final java.lang.String component3() {
            r1 = this;
            java.lang.String r0 = r1.contract
            return r0
    }

    public final p255od.C5199e.a component4() {
            r1 = this;
            od.e$a r0 = r1.template
            return r0
    }

    public final p255od.C5199e copy(java.lang.String r2, java.lang.String r3, java.lang.String r4, p255od.C5199e.a r5) {
            r1 = this;
            java.lang.String r0 = "asset_id"
            p214m2.C4339q.m9706k(r2, r0)
            java.lang.String r0 = "name"
            p214m2.C4339q.m9706k(r3, r0)
            java.lang.String r0 = "contract"
            p214m2.C4339q.m9706k(r4, r0)
            java.lang.String r0 = "template"
            p214m2.C4339q.m9706k(r5, r0)
            od.e r0 = new od.e
            r0.<init>(r2, r3, r4, r5)
            return r0
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof p255od.C5199e
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            od.e r5 = (p255od.C5199e) r5
            java.lang.String r1 = r4.asset_id
            java.lang.String r3 = r5.asset_id
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.String r1 = r4.name
            java.lang.String r3 = r5.name
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            java.lang.String r1 = r4.contract
            java.lang.String r3 = r5.contract
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L2d
            return r2
        L2d:
            od.e$a r1 = r4.template
            od.e$a r5 = r5.template
            boolean r5 = p214m2.C4339q.m9702c(r1, r5)
            if (r5 != 0) goto L38
            return r2
        L38:
            return r0
    }

    public final java.lang.String getAsset_id() {
            r1 = this;
            java.lang.String r0 = r1.asset_id
            return r0
    }

    public final java.lang.String getContract() {
            r1 = this;
            java.lang.String r0 = r1.contract
            return r0
    }

    public final java.lang.String getName() {
            r1 = this;
            java.lang.String r0 = r1.name
            return r0
    }

    public final p255od.C5199e.a getTemplate() {
            r1 = this;
            od.e$a r0 = r1.template
            return r0
    }

    public int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.asset_id
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.lang.String r1 = r3.name
            r2 = 31
            int r0 = p213m1.C4319e.m9651a(r1, r0, r2)
            java.lang.String r1 = r3.contract
            int r0 = p213m1.C4319e.m9651a(r1, r0, r2)
            od.e$a r1 = r3.template
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = "AtomicAssetsSong(asset_id="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.lang.String r1 = r2.asset_id
            r0.append(r1)
            java.lang.String r1 = ", name="
            r0.append(r1)
            java.lang.String r1 = r2.name
            r0.append(r1)
            java.lang.String r1 = ", contract="
            r0.append(r1)
            java.lang.String r1 = r2.contract
            r0.append(r1)
            java.lang.String r1 = ", template="
            r0.append(r1)
            od.e$a r1 = r2.template
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
