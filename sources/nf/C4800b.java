package nf;

/* renamed from: nf.b */
/* loaded from: classes.dex */
public final class C4800b {
    public static final nf.C4800b.a Companion = null;
    private final java.lang.String asset_id;
    private final java.lang.String name;
    private final nf.C4800b.b template;

    /* renamed from: nf.b$a */
    public static final class a {
        private a() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ a(p239nh.C4826f r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public final nf.C4800b createFakePlant(java.lang.String r6) {
                r5 = this;
                java.lang.String r0 = "plant_id"
                p214m2.C4339q.m9706k(r6, r0)
                nf.b r0 = new nf.b
                nf.b$b r1 = new nf.b$b
                nf.b$b$a r2 = new nf.b$b$a
                r3 = 0
                java.lang.String r4 = "No rarity"
                r2.<init>(r3, r4)
                java.lang.String r3 = "0"
                r1.<init>(r3, r2)
                java.lang.String r2 = "Tomato"
                r0.<init>(r6, r2, r1)
                return r0
        }
    }

    /* renamed from: nf.b$b */
    public static final class b {
        private final nf.C4800b.b.a immutable_data;
        private final java.lang.String template_id;

        /* renamed from: nf.b$b$a */
        public static final class a {
            private final java.lang.String img;

            @p189kb.InterfaceC4079b("rarity")
            private final java.lang.String rarity_value;

            public a(java.lang.String r1, java.lang.String r2) {
                    r0 = this;
                    r0.<init>()
                    r0.img = r1
                    r0.rarity_value = r2
                    return
            }

            public /* synthetic */ a(java.lang.String r1, java.lang.String r2, int r3, p239nh.C4826f r4) {
                    r0 = this;
                    r3 = r3 & 1
                    if (r3 == 0) goto L5
                    r1 = 0
                L5:
                    r0.<init>(r1, r2)
                    return
            }

            public static /* synthetic */ nf.C4800b.b.a copy$default(nf.C4800b.b.a r0, java.lang.String r1, java.lang.String r2, int r3, java.lang.Object r4) {
                    r4 = r3 & 1
                    if (r4 == 0) goto L6
                    java.lang.String r1 = r0.img
                L6:
                    r3 = r3 & 2
                    if (r3 == 0) goto Lc
                    java.lang.String r2 = r0.rarity_value
                Lc:
                    nf.b$b$a r0 = r0.copy(r1, r2)
                    return r0
            }

            public final java.lang.String component1() {
                    r1 = this;
                    java.lang.String r0 = r1.img
                    return r0
            }

            public final java.lang.String component2() {
                    r1 = this;
                    java.lang.String r0 = r1.rarity_value
                    return r0
            }

            public final nf.C4800b.b.a copy(java.lang.String r2, java.lang.String r3) {
                    r1 = this;
                    nf.b$b$a r0 = new nf.b$b$a
                    r0.<init>(r2, r3)
                    return r0
            }

            public boolean equals(java.lang.Object r5) {
                    r4 = this;
                    r0 = 1
                    if (r4 != r5) goto L4
                    return r0
                L4:
                    boolean r1 = r5 instanceof nf.C4800b.b.a
                    r2 = 0
                    if (r1 != 0) goto La
                    return r2
                La:
                    nf.b$b$a r5 = (nf.C4800b.b.a) r5
                    java.lang.String r1 = r4.img
                    java.lang.String r3 = r5.img
                    boolean r1 = p214m2.C4339q.m9702c(r1, r3)
                    if (r1 != 0) goto L17
                    return r2
                L17:
                    java.lang.String r1 = r4.rarity_value
                    java.lang.String r5 = r5.rarity_value
                    boolean r5 = p214m2.C4339q.m9702c(r1, r5)
                    if (r5 != 0) goto L22
                    return r2
                L22:
                    return r0
            }

            public final java.lang.String getImageUrl() {
                    r1 = this;
                    java.lang.String r0 = r1.img
                    java.lang.String r0 = p074e9.C1805a.m4526k(r0)
                    return r0
            }

            public final java.lang.String getImg() {
                    r1 = this;
                    java.lang.String r0 = r1.img
                    return r0
            }

            public final java.lang.String getRarity() {
                    r1 = this;
                    java.lang.String r0 = r1.rarity_value
                    if (r0 == 0) goto Ld
                    boolean r0 = p362uh.C6463i.m13054K(r0)
                    if (r0 == 0) goto Lb
                    goto Ld
                Lb:
                    r0 = 0
                    goto Le
                Ld:
                    r0 = 1
                Le:
                    if (r0 == 0) goto L13
                    java.lang.String r0 = "--"
                    goto L15
                L13:
                    java.lang.String r0 = r1.rarity_value
                L15:
                    return r0
            }

            public final java.lang.String getRarity_value() {
                    r1 = this;
                    java.lang.String r0 = r1.rarity_value
                    return r0
            }

            public int hashCode() {
                    r3 = this;
                    java.lang.String r0 = r3.img
                    r1 = 0
                    if (r0 != 0) goto L7
                    r0 = 0
                    goto Lb
                L7:
                    int r0 = r0.hashCode()
                Lb:
                    int r0 = r0 * 31
                    java.lang.String r2 = r3.rarity_value
                    if (r2 != 0) goto L12
                    goto L16
                L12:
                    int r1 = r2.hashCode()
                L16:
                    int r0 = r0 + r1
                    return r0
            }

            public java.lang.String toString() {
                    r3 = this;
                    java.lang.String r0 = "ImmutableData(img="
                    java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
                    java.lang.String r1 = r3.img
                    r0.append(r1)
                    java.lang.String r1 = ", rarity_value="
                    r0.append(r1)
                    java.lang.String r1 = r3.rarity_value
                    r2 = 41
                    java.lang.String r0 = p185k7.C3814g5.m8552a(r0, r1, r2)
                    return r0
            }
        }

        public b(java.lang.String r2, nf.C4800b.b.a r3) {
                r1 = this;
                java.lang.String r0 = "template_id"
                p214m2.C4339q.m9706k(r2, r0)
                java.lang.String r0 = "immutable_data"
                p214m2.C4339q.m9706k(r3, r0)
                r1.<init>()
                r1.template_id = r2
                r1.immutable_data = r3
                return
        }

        public static /* synthetic */ nf.C4800b.b copy$default(nf.C4800b.b r0, java.lang.String r1, nf.C4800b.b.a r2, int r3, java.lang.Object r4) {
                r4 = r3 & 1
                if (r4 == 0) goto L6
                java.lang.String r1 = r0.template_id
            L6:
                r3 = r3 & 2
                if (r3 == 0) goto Lc
                nf.b$b$a r2 = r0.immutable_data
            Lc:
                nf.b$b r0 = r0.copy(r1, r2)
                return r0
        }

        public final java.lang.String component1() {
                r1 = this;
                java.lang.String r0 = r1.template_id
                return r0
        }

        public final nf.C4800b.b.a component2() {
                r1 = this;
                nf.b$b$a r0 = r1.immutable_data
                return r0
        }

        public final nf.C4800b.b copy(java.lang.String r2, nf.C4800b.b.a r3) {
                r1 = this;
                java.lang.String r0 = "template_id"
                p214m2.C4339q.m9706k(r2, r0)
                java.lang.String r0 = "immutable_data"
                p214m2.C4339q.m9706k(r3, r0)
                nf.b$b r0 = new nf.b$b
                r0.<init>(r2, r3)
                return r0
        }

        public boolean equals(java.lang.Object r5) {
                r4 = this;
                r0 = 1
                if (r4 != r5) goto L4
                return r0
            L4:
                boolean r1 = r5 instanceof nf.C4800b.b
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                nf.b$b r5 = (nf.C4800b.b) r5
                java.lang.String r1 = r4.template_id
                java.lang.String r3 = r5.template_id
                boolean r1 = p214m2.C4339q.m9702c(r1, r3)
                if (r1 != 0) goto L17
                return r2
            L17:
                nf.b$b$a r1 = r4.immutable_data
                nf.b$b$a r5 = r5.immutable_data
                boolean r5 = p214m2.C4339q.m9702c(r1, r5)
                if (r5 != 0) goto L22
                return r2
            L22:
                return r0
        }

        public final nf.C4800b.b.a getImmutable_data() {
                r1 = this;
                nf.b$b$a r0 = r1.immutable_data
                return r0
        }

        public final java.lang.String getTemplate_id() {
                r1 = this;
                java.lang.String r0 = r1.template_id
                return r0
        }

        public int hashCode() {
                r2 = this;
                java.lang.String r0 = r2.template_id
                int r0 = r0.hashCode()
                int r0 = r0 * 31
                nf.b$b$a r1 = r2.immutable_data
                int r1 = r1.hashCode()
                int r1 = r1 + r0
                return r1
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.String r0 = "Template(template_id="
                java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
                java.lang.String r1 = r2.template_id
                r0.append(r1)
                java.lang.String r1 = ", immutable_data="
                r0.append(r1)
                nf.b$b$a r1 = r2.immutable_data
                r0.append(r1)
                r1 = 41
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    static {
            nf.b$a r0 = new nf.b$a
            r1 = 0
            r0.<init>(r1)
            nf.C4800b.Companion = r0
            return
    }

    public C4800b(java.lang.String r2, java.lang.String r3, nf.C4800b.b r4) {
            r1 = this;
            java.lang.String r0 = "asset_id"
            p214m2.C4339q.m9706k(r2, r0)
            java.lang.String r0 = "name"
            p214m2.C4339q.m9706k(r3, r0)
            java.lang.String r0 = "template"
            p214m2.C4339q.m9706k(r4, r0)
            r1.<init>()
            r1.asset_id = r2
            r1.name = r3
            r1.template = r4
            return
    }

    public static /* synthetic */ nf.C4800b copy$default(nf.C4800b r0, java.lang.String r1, java.lang.String r2, nf.C4800b.b r3, int r4, java.lang.Object r5) {
            r5 = r4 & 1
            if (r5 == 0) goto L6
            java.lang.String r1 = r0.asset_id
        L6:
            r5 = r4 & 2
            if (r5 == 0) goto Lc
            java.lang.String r2 = r0.name
        Lc:
            r4 = r4 & 4
            if (r4 == 0) goto L12
            nf.b$b r3 = r0.template
        L12:
            nf.b r0 = r0.copy(r1, r2, r3)
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

    public final nf.C4800b.b component3() {
            r1 = this;
            nf.b$b r0 = r1.template
            return r0
    }

    public final nf.C4800b copy(java.lang.String r2, java.lang.String r3, nf.C4800b.b r4) {
            r1 = this;
            java.lang.String r0 = "asset_id"
            p214m2.C4339q.m9706k(r2, r0)
            java.lang.String r0 = "name"
            p214m2.C4339q.m9706k(r3, r0)
            java.lang.String r0 = "template"
            p214m2.C4339q.m9706k(r4, r0)
            nf.b r0 = new nf.b
            r0.<init>(r2, r3, r4)
            return r0
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof nf.C4800b
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            nf.b r5 = (nf.C4800b) r5
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
            nf.b$b r1 = r4.template
            nf.b$b r5 = r5.template
            boolean r5 = p214m2.C4339q.m9702c(r1, r5)
            if (r5 != 0) goto L2d
            return r2
        L2d:
            return r0
    }

    public final java.lang.String getAsset_id() {
            r1 = this;
            java.lang.String r0 = r1.asset_id
            return r0
    }

    public final java.lang.String getName() {
            r1 = this;
            java.lang.String r0 = r1.name
            return r0
    }

    public final nf.C4800b.b getTemplate() {
            r1 = this;
            nf.b$b r0 = r1.template
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
            nf.b$b r1 = r3.template
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = "AtomicAssetsFarming(asset_id="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.lang.String r1 = r2.asset_id
            r0.append(r1)
            java.lang.String r1 = ", name="
            r0.append(r1)
            java.lang.String r1 = r2.name
            r0.append(r1)
            java.lang.String r1 = ", template="
            r0.append(r1)
            nf.b$b r1 = r2.template
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
