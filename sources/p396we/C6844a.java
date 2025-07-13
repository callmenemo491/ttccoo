package p396we;

/* renamed from: we.a */
/* loaded from: classes.dex */
public final class C6844a {
    private final java.lang.String asset_id;
    private final java.lang.String name;
    private final p396we.C6844a.a template;

    /* renamed from: we.a$a */
    public static final class a {
        private final p396we.C6844a.a.C7429a immutable_data;
        private final java.lang.String template_id;

        /* renamed from: we.a$a$a, reason: collision with other inner class name */
        public static final class C7429a {
            private final java.lang.String img;
            private final java.lang.String rarity;
            private final java.lang.String static_img;

            public C7429a() {
                    r6 = this;
                    r1 = 0
                    r2 = 0
                    r3 = 0
                    r4 = 7
                    r5 = 0
                    r0 = r6
                    r0.<init>(r1, r2, r3, r4, r5)
                    return
            }

            public C7429a(java.lang.String r2, java.lang.String r3, java.lang.String r4) {
                    r1 = this;
                    java.lang.String r0 = "rarity"
                    p214m2.C4339q.m9706k(r4, r0)
                    r1.<init>()
                    r1.img = r2
                    r1.static_img = r3
                    r1.rarity = r4
                    return
            }

            public /* synthetic */ C7429a(java.lang.String r2, java.lang.String r3, java.lang.String r4, int r5, p239nh.C4826f r6) {
                    r1 = this;
                    r6 = r5 & 1
                    r0 = 0
                    if (r6 == 0) goto L6
                    r2 = r0
                L6:
                    r6 = r5 & 2
                    if (r6 == 0) goto Lb
                    r3 = r0
                Lb:
                    r5 = r5 & 4
                    if (r5 == 0) goto L11
                    java.lang.String r4 = ""
                L11:
                    r1.<init>(r2, r3, r4)
                    return
            }

            public static /* synthetic */ p396we.C6844a.a.C7429a copy$default(p396we.C6844a.a.C7429a r0, java.lang.String r1, java.lang.String r2, java.lang.String r3, int r4, java.lang.Object r5) {
                    r5 = r4 & 1
                    if (r5 == 0) goto L6
                    java.lang.String r1 = r0.img
                L6:
                    r5 = r4 & 2
                    if (r5 == 0) goto Lc
                    java.lang.String r2 = r0.static_img
                Lc:
                    r4 = r4 & 4
                    if (r4 == 0) goto L12
                    java.lang.String r3 = r0.rarity
                L12:
                    we.a$a$a r0 = r0.copy(r1, r2, r3)
                    return r0
            }

            public final java.lang.String component1() {
                    r1 = this;
                    java.lang.String r0 = r1.img
                    return r0
            }

            public final java.lang.String component2() {
                    r1 = this;
                    java.lang.String r0 = r1.static_img
                    return r0
            }

            public final java.lang.String component3() {
                    r1 = this;
                    java.lang.String r0 = r1.rarity
                    return r0
            }

            public final p396we.C6844a.a.C7429a copy(java.lang.String r2, java.lang.String r3, java.lang.String r4) {
                    r1 = this;
                    java.lang.String r0 = "rarity"
                    p214m2.C4339q.m9706k(r4, r0)
                    we.a$a$a r0 = new we.a$a$a
                    r0.<init>(r2, r3, r4)
                    return r0
            }

            public boolean equals(java.lang.Object r5) {
                    r4 = this;
                    r0 = 1
                    if (r4 != r5) goto L4
                    return r0
                L4:
                    boolean r1 = r5 instanceof p396we.C6844a.a.C7429a
                    r2 = 0
                    if (r1 != 0) goto La
                    return r2
                La:
                    we.a$a$a r5 = (p396we.C6844a.a.C7429a) r5
                    java.lang.String r1 = r4.img
                    java.lang.String r3 = r5.img
                    boolean r1 = p214m2.C4339q.m9702c(r1, r3)
                    if (r1 != 0) goto L17
                    return r2
                L17:
                    java.lang.String r1 = r4.static_img
                    java.lang.String r3 = r5.static_img
                    boolean r1 = p214m2.C4339q.m9702c(r1, r3)
                    if (r1 != 0) goto L22
                    return r2
                L22:
                    java.lang.String r1 = r4.rarity
                    java.lang.String r5 = r5.rarity
                    boolean r5 = p214m2.C4339q.m9702c(r1, r5)
                    if (r5 != 0) goto L2d
                    return r2
                L2d:
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
                    java.lang.String r0 = r1.rarity
                    return r0
            }

            public final java.lang.String getStatic_img() {
                    r1 = this;
                    java.lang.String r0 = r1.static_img
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
                    java.lang.String r2 = r3.static_img
                    if (r2 != 0) goto L12
                    goto L16
                L12:
                    int r1 = r2.hashCode()
                L16:
                    int r0 = r0 + r1
                    int r0 = r0 * 31
                    java.lang.String r1 = r3.rarity
                    int r1 = r1.hashCode()
                    int r1 = r1 + r0
                    return r1
            }

            public java.lang.String toString() {
                    r3 = this;
                    java.lang.String r0 = "ImmutableData(img="
                    java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
                    java.lang.String r1 = r3.img
                    r0.append(r1)
                    java.lang.String r1 = ", static_img="
                    r0.append(r1)
                    java.lang.String r1 = r3.static_img
                    r0.append(r1)
                    java.lang.String r1 = ", rarity="
                    r0.append(r1)
                    java.lang.String r1 = r3.rarity
                    r2 = 41
                    java.lang.String r0 = p185k7.C3814g5.m8552a(r0, r1, r2)
                    return r0
            }
        }

        public a(java.lang.String r2, p396we.C6844a.a.C7429a r3) {
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

        public static /* synthetic */ p396we.C6844a.a copy$default(p396we.C6844a.a r0, java.lang.String r1, p396we.C6844a.a.C7429a r2, int r3, java.lang.Object r4) {
                r4 = r3 & 1
                if (r4 == 0) goto L6
                java.lang.String r1 = r0.template_id
            L6:
                r3 = r3 & 2
                if (r3 == 0) goto Lc
                we.a$a$a r2 = r0.immutable_data
            Lc:
                we.a$a r0 = r0.copy(r1, r2)
                return r0
        }

        public final java.lang.String component1() {
                r1 = this;
                java.lang.String r0 = r1.template_id
                return r0
        }

        public final p396we.C6844a.a.C7429a component2() {
                r1 = this;
                we.a$a$a r0 = r1.immutable_data
                return r0
        }

        public final p396we.C6844a.a copy(java.lang.String r2, p396we.C6844a.a.C7429a r3) {
                r1 = this;
                java.lang.String r0 = "template_id"
                p214m2.C4339q.m9706k(r2, r0)
                java.lang.String r0 = "immutable_data"
                p214m2.C4339q.m9706k(r3, r0)
                we.a$a r0 = new we.a$a
                r0.<init>(r2, r3)
                return r0
        }

        public boolean equals(java.lang.Object r5) {
                r4 = this;
                r0 = 1
                if (r4 != r5) goto L4
                return r0
            L4:
                boolean r1 = r5 instanceof p396we.C6844a.a
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                we.a$a r5 = (p396we.C6844a.a) r5
                java.lang.String r1 = r4.template_id
                java.lang.String r3 = r5.template_id
                boolean r1 = p214m2.C4339q.m9702c(r1, r3)
                if (r1 != 0) goto L17
                return r2
            L17:
                we.a$a$a r1 = r4.immutable_data
                we.a$a$a r5 = r5.immutable_data
                boolean r5 = p214m2.C4339q.m9702c(r1, r5)
                if (r5 != 0) goto L22
                return r2
            L22:
                return r0
        }

        public final p396we.C6844a.a.C7429a getImmutable_data() {
                r1 = this;
                we.a$a$a r0 = r1.immutable_data
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
                we.a$a$a r1 = r2.immutable_data
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
                we.a$a$a r1 = r2.immutable_data
                r0.append(r1)
                r1 = 41
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    public C6844a(java.lang.String r2, java.lang.String r3, p396we.C6844a.a r4) {
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

    public static /* synthetic */ p396we.C6844a copy$default(p396we.C6844a r0, java.lang.String r1, java.lang.String r2, p396we.C6844a.a r3, int r4, java.lang.Object r5) {
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
            we.a$a r3 = r0.template
        L12:
            we.a r0 = r0.copy(r1, r2, r3)
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

    public final p396we.C6844a.a component3() {
            r1 = this;
            we.a$a r0 = r1.template
            return r0
    }

    public final p396we.C6844a copy(java.lang.String r2, java.lang.String r3, p396we.C6844a.a r4) {
            r1 = this;
            java.lang.String r0 = "asset_id"
            p214m2.C4339q.m9706k(r2, r0)
            java.lang.String r0 = "name"
            p214m2.C4339q.m9706k(r3, r0)
            java.lang.String r0 = "template"
            p214m2.C4339q.m9706k(r4, r0)
            we.a r0 = new we.a
            r0.<init>(r2, r3, r4)
            return r0
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof p396we.C6844a
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            we.a r5 = (p396we.C6844a) r5
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
            we.a$a r1 = r4.template
            we.a$a r5 = r5.template
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

    public final p396we.C6844a.a getTemplate() {
            r1 = this;
            we.a$a r0 = r1.template
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
            we.a$a r1 = r3.template
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = "AtomicAssetBrawler(asset_id="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.lang.String r1 = r2.asset_id
            r0.append(r1)
            java.lang.String r1 = ", name="
            r0.append(r1)
            java.lang.String r1 = r2.name
            r0.append(r1)
            java.lang.String r1 = ", template="
            r0.append(r1)
            we.a$a r1 = r2.template
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
