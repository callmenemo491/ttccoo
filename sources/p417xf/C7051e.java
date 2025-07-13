package p417xf;

/* renamed from: xf.e */
/* loaded from: classes.dex */
public final class C7051e {
    private final java.lang.String asset_id;
    private final p417xf.C7051e.b collection;

    @p189kb.InterfaceC4079b("data")
    private final p417xf.C7051e.c data;
    private final java.lang.String name;
    private final java.lang.String owner;
    private final java.util.List<p417xf.C7051e.a> prices;
    private final p417xf.C7051e.d template;
    private final java.lang.String template_mint;

    /* renamed from: xf.e$a */
    public static final class a {

        @p189kb.InterfaceC4079b("suggested_median")
        private final java.lang.String suggestedMedian;
        private final p417xf.C7051e.a.C7431a token;

        /* renamed from: xf.e$a$a, reason: collision with other inner class name */
        public static final class C7431a {
            private final java.lang.String token_symbol;

            public C7431a(java.lang.String r2) {
                    r1 = this;
                    java.lang.String r0 = "token_symbol"
                    p214m2.C4339q.m9706k(r2, r0)
                    r1.<init>()
                    r1.token_symbol = r2
                    return
            }

            public static /* synthetic */ p417xf.C7051e.a.C7431a copy$default(p417xf.C7051e.a.C7431a r0, java.lang.String r1, int r2, java.lang.Object r3) {
                    r2 = r2 & 1
                    if (r2 == 0) goto L6
                    java.lang.String r1 = r0.token_symbol
                L6:
                    xf.e$a$a r0 = r0.copy(r1)
                    return r0
            }

            public final java.lang.String component1() {
                    r1 = this;
                    java.lang.String r0 = r1.token_symbol
                    return r0
            }

            public final p417xf.C7051e.a.C7431a copy(java.lang.String r2) {
                    r1 = this;
                    java.lang.String r0 = "token_symbol"
                    p214m2.C4339q.m9706k(r2, r0)
                    xf.e$a$a r0 = new xf.e$a$a
                    r0.<init>(r2)
                    return r0
            }

            public boolean equals(java.lang.Object r4) {
                    r3 = this;
                    r0 = 1
                    if (r3 != r4) goto L4
                    return r0
                L4:
                    boolean r1 = r4 instanceof p417xf.C7051e.a.C7431a
                    r2 = 0
                    if (r1 != 0) goto La
                    return r2
                La:
                    xf.e$a$a r4 = (p417xf.C7051e.a.C7431a) r4
                    java.lang.String r1 = r3.token_symbol
                    java.lang.String r4 = r4.token_symbol
                    boolean r4 = p214m2.C4339q.m9702c(r1, r4)
                    if (r4 != 0) goto L17
                    return r2
                L17:
                    return r0
            }

            public final java.lang.String getToken_symbol() {
                    r1 = this;
                    java.lang.String r0 = r1.token_symbol
                    return r0
            }

            public int hashCode() {
                    r1 = this;
                    java.lang.String r0 = r1.token_symbol
                    int r0 = r0.hashCode()
                    return r0
            }

            public java.lang.String toString() {
                    r3 = this;
                    java.lang.String r0 = "Token(token_symbol="
                    java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
                    java.lang.String r1 = r3.token_symbol
                    r2 = 41
                    java.lang.String r0 = p185k7.C3814g5.m8552a(r0, r1, r2)
                    return r0
            }
        }

        public a(java.lang.String r2, p417xf.C7051e.a.C7431a r3) {
                r1 = this;
                java.lang.String r0 = "suggestedMedian"
                p214m2.C4339q.m9706k(r2, r0)
                java.lang.String r0 = "token"
                p214m2.C4339q.m9706k(r3, r0)
                r1.<init>()
                r1.suggestedMedian = r2
                r1.token = r3
                return
        }

        public static /* synthetic */ p417xf.C7051e.a copy$default(p417xf.C7051e.a r0, java.lang.String r1, p417xf.C7051e.a.C7431a r2, int r3, java.lang.Object r4) {
                r4 = r3 & 1
                if (r4 == 0) goto L6
                java.lang.String r1 = r0.suggestedMedian
            L6:
                r3 = r3 & 2
                if (r3 == 0) goto Lc
                xf.e$a$a r2 = r0.token
            Lc:
                xf.e$a r0 = r0.copy(r1, r2)
                return r0
        }

        public final java.lang.String component1() {
                r1 = this;
                java.lang.String r0 = r1.suggestedMedian
                return r0
        }

        public final p417xf.C7051e.a.C7431a component2() {
                r1 = this;
                xf.e$a$a r0 = r1.token
                return r0
        }

        public final p417xf.C7051e.a copy(java.lang.String r2, p417xf.C7051e.a.C7431a r3) {
                r1 = this;
                java.lang.String r0 = "suggestedMedian"
                p214m2.C4339q.m9706k(r2, r0)
                java.lang.String r0 = "token"
                p214m2.C4339q.m9706k(r3, r0)
                xf.e$a r0 = new xf.e$a
                r0.<init>(r2, r3)
                return r0
        }

        public boolean equals(java.lang.Object r5) {
                r4 = this;
                r0 = 1
                if (r4 != r5) goto L4
                return r0
            L4:
                boolean r1 = r5 instanceof p417xf.C7051e.a
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                xf.e$a r5 = (p417xf.C7051e.a) r5
                java.lang.String r1 = r4.suggestedMedian
                java.lang.String r3 = r5.suggestedMedian
                boolean r1 = p214m2.C4339q.m9702c(r1, r3)
                if (r1 != 0) goto L17
                return r2
            L17:
                xf.e$a$a r1 = r4.token
                xf.e$a$a r5 = r5.token
                boolean r5 = p214m2.C4339q.m9702c(r1, r5)
                if (r5 != 0) goto L22
                return r2
            L22:
                return r0
        }

        public final java.lang.String getSuggestedMedian() {
                r1 = this;
                java.lang.String r0 = r1.suggestedMedian
                return r0
        }

        public final p417xf.C7051e.a.C7431a getToken() {
                r1 = this;
                xf.e$a$a r0 = r1.token
                return r0
        }

        public int hashCode() {
                r2 = this;
                java.lang.String r0 = r2.suggestedMedian
                int r0 = r0.hashCode()
                int r0 = r0 * 31
                xf.e$a$a r1 = r2.token
                int r1 = r1.hashCode()
                int r1 = r1 + r0
                return r1
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.String r0 = "AtomicPrice(suggestedMedian="
                java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
                java.lang.String r1 = r2.suggestedMedian
                r0.append(r1)
                java.lang.String r1 = ", token="
                r0.append(r1)
                xf.e$a$a r1 = r2.token
                r0.append(r1)
                r1 = 41
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    /* renamed from: xf.e$b */
    public static final class b {
        private final java.lang.String collection_name;

        public b(java.lang.String r1) {
                r0 = this;
                r0.<init>()
                r0.collection_name = r1
                return
        }

        public static /* synthetic */ p417xf.C7051e.b copy$default(p417xf.C7051e.b r0, java.lang.String r1, int r2, java.lang.Object r3) {
                r2 = r2 & 1
                if (r2 == 0) goto L6
                java.lang.String r1 = r0.collection_name
            L6:
                xf.e$b r0 = r0.copy(r1)
                return r0
        }

        public final java.lang.String component1() {
                r1 = this;
                java.lang.String r0 = r1.collection_name
                return r0
        }

        public final p417xf.C7051e.b copy(java.lang.String r2) {
                r1 = this;
                xf.e$b r0 = new xf.e$b
                r0.<init>(r2)
                return r0
        }

        public boolean equals(java.lang.Object r4) {
                r3 = this;
                r0 = 1
                if (r3 != r4) goto L4
                return r0
            L4:
                boolean r1 = r4 instanceof p417xf.C7051e.b
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                xf.e$b r4 = (p417xf.C7051e.b) r4
                java.lang.String r1 = r3.collection_name
                java.lang.String r4 = r4.collection_name
                boolean r4 = p214m2.C4339q.m9702c(r1, r4)
                if (r4 != 0) goto L17
                return r2
            L17:
                return r0
        }

        public final java.lang.String getCollection_name() {
                r1 = this;
                java.lang.String r0 = r1.collection_name
                return r0
        }

        public int hashCode() {
                r1 = this;
                java.lang.String r0 = r1.collection_name
                if (r0 != 0) goto L6
                r0 = 0
                goto La
            L6:
                int r0 = r0.hashCode()
            La:
                return r0
        }

        public java.lang.String toString() {
                r3 = this;
                java.lang.String r0 = "Collection(collection_name="
                java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
                java.lang.String r1 = r3.collection_name
                r2 = 41
                java.lang.String r0 = p185k7.C3814g5.m8552a(r0, r1, r2)
                return r0
        }
    }

    /* renamed from: xf.e$c */
    public static final class c {
        private final java.lang.String image;
        private final java.lang.String img;
        private final java.lang.String name;
        private final java.lang.String original_image;
        private final java.lang.String video;

        public c(java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5) {
                r0 = this;
                r0.<init>()
                r0.img = r1
                r0.name = r2
                r0.video = r3
                r0.image = r4
                r0.original_image = r5
                return
        }

        public static /* synthetic */ p417xf.C7051e.c copy$default(p417xf.C7051e.c r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, int r9, java.lang.Object r10) {
                r10 = r9 & 1
                if (r10 == 0) goto L6
                java.lang.String r4 = r3.img
            L6:
                r10 = r9 & 2
                if (r10 == 0) goto Lc
                java.lang.String r5 = r3.name
            Lc:
                r10 = r5
                r5 = r9 & 4
                if (r5 == 0) goto L13
                java.lang.String r6 = r3.video
            L13:
                r0 = r6
                r5 = r9 & 8
                if (r5 == 0) goto L1a
                java.lang.String r7 = r3.image
            L1a:
                r1 = r7
                r5 = r9 & 16
                if (r5 == 0) goto L21
                java.lang.String r8 = r3.original_image
            L21:
                r2 = r8
                r5 = r3
                r6 = r4
                r7 = r10
                r8 = r0
                r9 = r1
                r10 = r2
                xf.e$c r3 = r5.copy(r6, r7, r8, r9, r10)
                return r3
        }

        public final java.lang.String component1() {
                r1 = this;
                java.lang.String r0 = r1.img
                return r0
        }

        public final java.lang.String component2() {
                r1 = this;
                java.lang.String r0 = r1.name
                return r0
        }

        public final java.lang.String component3() {
                r1 = this;
                java.lang.String r0 = r1.video
                return r0
        }

        public final java.lang.String component4() {
                r1 = this;
                java.lang.String r0 = r1.image
                return r0
        }

        public final java.lang.String component5() {
                r1 = this;
                java.lang.String r0 = r1.original_image
                return r0
        }

        public final p417xf.C7051e.c copy(java.lang.String r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.String r12) {
                r7 = this;
                xf.e$c r6 = new xf.e$c
                r0 = r6
                r1 = r8
                r2 = r9
                r3 = r10
                r4 = r11
                r5 = r12
                r0.<init>(r1, r2, r3, r4, r5)
                return r6
        }

        public boolean equals(java.lang.Object r5) {
                r4 = this;
                r0 = 1
                if (r4 != r5) goto L4
                return r0
            L4:
                boolean r1 = r5 instanceof p417xf.C7051e.c
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                xf.e$c r5 = (p417xf.C7051e.c) r5
                java.lang.String r1 = r4.img
                java.lang.String r3 = r5.img
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
                java.lang.String r1 = r4.video
                java.lang.String r3 = r5.video
                boolean r1 = p214m2.C4339q.m9702c(r1, r3)
                if (r1 != 0) goto L2d
                return r2
            L2d:
                java.lang.String r1 = r4.image
                java.lang.String r3 = r5.image
                boolean r1 = p214m2.C4339q.m9702c(r1, r3)
                if (r1 != 0) goto L38
                return r2
            L38:
                java.lang.String r1 = r4.original_image
                java.lang.String r5 = r5.original_image
                boolean r5 = p214m2.C4339q.m9702c(r1, r5)
                if (r5 != 0) goto L43
                return r2
            L43:
                return r0
        }

        public final java.lang.String getImage() {
                r1 = this;
                java.lang.String r0 = r1.image
                return r0
        }

        public final java.lang.String getImg() {
                r1 = this;
                java.lang.String r0 = r1.img
                return r0
        }

        public final java.lang.String getName() {
                r1 = this;
                java.lang.String r0 = r1.name
                return r0
        }

        public final java.lang.String getOriginal_image() {
                r1 = this;
                java.lang.String r0 = r1.original_image
                return r0
        }

        public final java.lang.String getVideo() {
                r1 = this;
                java.lang.String r0 = r1.video
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
                java.lang.String r2 = r3.name
                if (r2 != 0) goto L13
                r2 = 0
                goto L17
            L13:
                int r2 = r2.hashCode()
            L17:
                int r0 = r0 + r2
                int r0 = r0 * 31
                java.lang.String r2 = r3.video
                if (r2 != 0) goto L20
                r2 = 0
                goto L24
            L20:
                int r2 = r2.hashCode()
            L24:
                int r0 = r0 + r2
                int r0 = r0 * 31
                java.lang.String r2 = r3.image
                if (r2 != 0) goto L2d
                r2 = 0
                goto L31
            L2d:
                int r2 = r2.hashCode()
            L31:
                int r0 = r0 + r2
                int r0 = r0 * 31
                java.lang.String r2 = r3.original_image
                if (r2 != 0) goto L39
                goto L3d
            L39:
                int r1 = r2.hashCode()
            L3d:
                int r0 = r0 + r1
                return r0
        }

        public java.lang.String toString() {
                r3 = this;
                java.lang.String r0 = "Data(img="
                java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
                java.lang.String r1 = r3.img
                r0.append(r1)
                java.lang.String r1 = ", name="
                r0.append(r1)
                java.lang.String r1 = r3.name
                r0.append(r1)
                java.lang.String r1 = ", video="
                r0.append(r1)
                java.lang.String r1 = r3.video
                r0.append(r1)
                java.lang.String r1 = ", image="
                r0.append(r1)
                java.lang.String r1 = r3.image
                r0.append(r1)
                java.lang.String r1 = ", original_image="
                r0.append(r1)
                java.lang.String r1 = r3.original_image
                r2 = 41
                java.lang.String r0 = p185k7.C3814g5.m8552a(r0, r1, r2)
                return r0
        }
    }

    /* renamed from: xf.e$d */
    public static final class d {
        private final java.lang.String template_id;

        public d(java.lang.String r1) {
                r0 = this;
                r0.<init>()
                r0.template_id = r1
                return
        }

        public static /* synthetic */ p417xf.C7051e.d copy$default(p417xf.C7051e.d r0, java.lang.String r1, int r2, java.lang.Object r3) {
                r2 = r2 & 1
                if (r2 == 0) goto L6
                java.lang.String r1 = r0.template_id
            L6:
                xf.e$d r0 = r0.copy(r1)
                return r0
        }

        public final java.lang.String component1() {
                r1 = this;
                java.lang.String r0 = r1.template_id
                return r0
        }

        public final p417xf.C7051e.d copy(java.lang.String r2) {
                r1 = this;
                xf.e$d r0 = new xf.e$d
                r0.<init>(r2)
                return r0
        }

        public boolean equals(java.lang.Object r4) {
                r3 = this;
                r0 = 1
                if (r3 != r4) goto L4
                return r0
            L4:
                boolean r1 = r4 instanceof p417xf.C7051e.d
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                xf.e$d r4 = (p417xf.C7051e.d) r4
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
                if (r0 != 0) goto L6
                r0 = 0
                goto La
            L6:
                int r0 = r0.hashCode()
            La:
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

    public C7051e(java.lang.String r2, p417xf.C7051e.c r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, p417xf.C7051e.b r7, p417xf.C7051e.d r8, java.util.List<p417xf.C7051e.a> r9) {
            r1 = this;
            java.lang.String r0 = "asset_id"
            p214m2.C4339q.m9706k(r2, r0)
            java.lang.String r0 = "data"
            p214m2.C4339q.m9706k(r3, r0)
            java.lang.String r0 = "name"
            p214m2.C4339q.m9706k(r4, r0)
            java.lang.String r0 = "owner"
            p214m2.C4339q.m9706k(r5, r0)
            r1.<init>()
            r1.asset_id = r2
            r1.data = r3
            r1.name = r4
            r1.owner = r5
            r1.template_mint = r6
            r1.collection = r7
            r1.template = r8
            r1.prices = r9
            return
    }

    public static /* synthetic */ p417xf.C7051e copy$default(p417xf.C7051e r9, java.lang.String r10, p417xf.C7051e.c r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, p417xf.C7051e.b r15, p417xf.C7051e.d r16, java.util.List r17, int r18, java.lang.Object r19) {
            r0 = r9
            r1 = r18
            r2 = r1 & 1
            if (r2 == 0) goto La
            java.lang.String r2 = r0.asset_id
            goto Lb
        La:
            r2 = r10
        Lb:
            r3 = r1 & 2
            if (r3 == 0) goto L12
            xf.e$c r3 = r0.data
            goto L13
        L12:
            r3 = r11
        L13:
            r4 = r1 & 4
            if (r4 == 0) goto L1a
            java.lang.String r4 = r0.name
            goto L1b
        L1a:
            r4 = r12
        L1b:
            r5 = r1 & 8
            if (r5 == 0) goto L22
            java.lang.String r5 = r0.owner
            goto L23
        L22:
            r5 = r13
        L23:
            r6 = r1 & 16
            if (r6 == 0) goto L2a
            java.lang.String r6 = r0.template_mint
            goto L2b
        L2a:
            r6 = r14
        L2b:
            r7 = r1 & 32
            if (r7 == 0) goto L32
            xf.e$b r7 = r0.collection
            goto L33
        L32:
            r7 = r15
        L33:
            r8 = r1 & 64
            if (r8 == 0) goto L3a
            xf.e$d r8 = r0.template
            goto L3c
        L3a:
            r8 = r16
        L3c:
            r1 = r1 & 128(0x80, float:1.8E-43)
            if (r1 == 0) goto L43
            java.util.List<xf.e$a> r1 = r0.prices
            goto L45
        L43:
            r1 = r17
        L45:
            r10 = r2
            r11 = r3
            r12 = r4
            r13 = r5
            r14 = r6
            r15 = r7
            r16 = r8
            r17 = r1
            xf.e r0 = r9.copy(r10, r11, r12, r13, r14, r15, r16, r17)
            return r0
    }

    public final java.lang.String component1() {
            r1 = this;
            java.lang.String r0 = r1.asset_id
            return r0
    }

    public final p417xf.C7051e.c component2() {
            r1 = this;
            xf.e$c r0 = r1.data
            return r0
    }

    public final java.lang.String component3() {
            r1 = this;
            java.lang.String r0 = r1.name
            return r0
    }

    public final java.lang.String component4() {
            r1 = this;
            java.lang.String r0 = r1.owner
            return r0
    }

    public final java.lang.String component5() {
            r1 = this;
            java.lang.String r0 = r1.template_mint
            return r0
    }

    public final p417xf.C7051e.b component6() {
            r1 = this;
            xf.e$b r0 = r1.collection
            return r0
    }

    public final p417xf.C7051e.d component7() {
            r1 = this;
            xf.e$d r0 = r1.template
            return r0
    }

    public final java.util.List<p417xf.C7051e.a> component8() {
            r1 = this;
            java.util.List<xf.e$a> r0 = r1.prices
            return r0
    }

    public final p417xf.C7051e copy(java.lang.String r11, p417xf.C7051e.c r12, java.lang.String r13, java.lang.String r14, java.lang.String r15, p417xf.C7051e.b r16, p417xf.C7051e.d r17, java.util.List<p417xf.C7051e.a> r18) {
            r10 = this;
            java.lang.String r0 = "asset_id"
            r2 = r11
            p214m2.C4339q.m9706k(r11, r0)
            java.lang.String r0 = "data"
            r3 = r12
            p214m2.C4339q.m9706k(r12, r0)
            java.lang.String r0 = "name"
            r4 = r13
            p214m2.C4339q.m9706k(r13, r0)
            java.lang.String r0 = "owner"
            r5 = r14
            p214m2.C4339q.m9706k(r14, r0)
            xf.e r0 = new xf.e
            r1 = r0
            r6 = r15
            r7 = r16
            r8 = r17
            r9 = r18
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            return r0
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof p417xf.C7051e
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            xf.e r5 = (p417xf.C7051e) r5
            java.lang.String r1 = r4.asset_id
            java.lang.String r3 = r5.asset_id
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            xf.e$c r1 = r4.data
            xf.e$c r3 = r5.data
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            java.lang.String r1 = r4.name
            java.lang.String r3 = r5.name
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L2d
            return r2
        L2d:
            java.lang.String r1 = r4.owner
            java.lang.String r3 = r5.owner
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L38
            return r2
        L38:
            java.lang.String r1 = r4.template_mint
            java.lang.String r3 = r5.template_mint
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L43
            return r2
        L43:
            xf.e$b r1 = r4.collection
            xf.e$b r3 = r5.collection
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L4e
            return r2
        L4e:
            xf.e$d r1 = r4.template
            xf.e$d r3 = r5.template
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L59
            return r2
        L59:
            java.util.List<xf.e$a> r1 = r4.prices
            java.util.List<xf.e$a> r5 = r5.prices
            boolean r5 = p214m2.C4339q.m9702c(r1, r5)
            if (r5 != 0) goto L64
            return r2
        L64:
            return r0
    }

    public final java.lang.String getAsset_id() {
            r1 = this;
            java.lang.String r0 = r1.asset_id
            return r0
    }

    public final p417xf.C7051e.b getCollection() {
            r1 = this;
            xf.e$b r0 = r1.collection
            return r0
    }

    public final p417xf.C7051e.c getData() {
            r1 = this;
            xf.e$c r0 = r1.data
            return r0
    }

    public final java.lang.String getName() {
            r1 = this;
            java.lang.String r0 = r1.name
            return r0
    }

    public final java.lang.String getOwner() {
            r1 = this;
            java.lang.String r0 = r1.owner
            return r0
    }

    public final double getPriceMedianWax() {
            r4 = this;
            java.util.List<xf.e$a> r0 = r4.prices
            if (r0 == 0) goto L22
            java.lang.Object r0 = p062dh.C1473i.m3996H(r0)
            xf.e$a r0 = (p417xf.C7051e.a) r0
            if (r0 == 0) goto L22
            java.lang.String r0 = r0.getSuggestedMedian()
            if (r0 == 0) goto L22
            java.lang.Double r0 = p362uh.C6462h.m13048E(r0)
            if (r0 == 0) goto L22
            double r0 = r0.doubleValue()
            r2 = 100000000(0x5f5e100, float:2.3122341E-35)
            double r2 = (double) r2
            double r0 = r0 / r2
            goto L24
        L22:
            r0 = 0
        L24:
            return r0
    }

    public final java.util.List<p417xf.C7051e.a> getPrices() {
            r1 = this;
            java.util.List<xf.e$a> r0 = r1.prices
            return r0
    }

    public final p417xf.C7051e.d getTemplate() {
            r1 = this;
            xf.e$d r0 = r1.template
            return r0
    }

    public final java.lang.String getTemplate_mint() {
            r1 = this;
            java.lang.String r0 = r1.template_mint
            return r0
    }

    public int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.asset_id
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            xf.e$c r1 = r3.data
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.String r0 = r3.name
            r2 = 31
            int r0 = p213m1.C4319e.m9651a(r0, r1, r2)
            java.lang.String r1 = r3.owner
            int r0 = p213m1.C4319e.m9651a(r1, r0, r2)
            java.lang.String r1 = r3.template_mint
            r2 = 0
            if (r1 != 0) goto L26
            r1 = 0
            goto L2a
        L26:
            int r1 = r1.hashCode()
        L2a:
            int r0 = r0 + r1
            int r0 = r0 * 31
            xf.e$b r1 = r3.collection
            if (r1 != 0) goto L33
            r1 = 0
            goto L37
        L33:
            int r1 = r1.hashCode()
        L37:
            int r0 = r0 + r1
            int r0 = r0 * 31
            xf.e$d r1 = r3.template
            if (r1 != 0) goto L40
            r1 = 0
            goto L44
        L40:
            int r1 = r1.hashCode()
        L44:
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.util.List<xf.e$a> r1 = r3.prices
            if (r1 != 0) goto L4c
            goto L50
        L4c:
            int r2 = r1.hashCode()
        L50:
            int r0 = r0 + r2
            return r0
    }

    public final io.tacocrypto.app.p156ui.tools.nftwallet.main.NFTAssetUI toNFTAssetUI() {
            r15 = this;
            double r0 = r15.getPriceMedianWax()
            io.tacocrypto.app.ui.tools.nftwallet.main.NFTAssetUI r14 = new io.tacocrypto.app.ui.tools.nftwallet.main.NFTAssetUI
            java.lang.String r3 = r15.asset_id
            xf.e$d r2 = r15.template
            r4 = 0
            if (r2 == 0) goto L13
            java.lang.String r2 = r2.getTemplate_id()
            r5 = r2
            goto L14
        L13:
            r5 = r4
        L14:
            java.lang.String r6 = r15.name
            xf.e$c r2 = r15.data
            java.lang.String r2 = r2.getImg()
            if (r2 != 0) goto L2c
            xf.e$c r2 = r15.data
            java.lang.String r2 = r2.getImage()
            if (r2 != 0) goto L2c
            xf.e$c r2 = r15.data
            java.lang.String r2 = r2.getOriginal_image()
        L2c:
            r7 = r2
            xf.e$c r2 = r15.data
            java.lang.String r8 = r2.getVideo()
            xf.e$b r2 = r15.collection
            if (r2 == 0) goto L3d
            java.lang.String r2 = r2.getCollection_name()
            r9 = r2
            goto L3e
        L3d:
            r9 = r4
        L3e:
            java.lang.String r10 = r15.template_mint
            r11 = 0
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
            r4 = 2
            r12 = 0
            java.lang.String r13 = vg.C6672m.m13537x(r2, r4, r12, r4)
            nd.q r2 = p238nd.C4770q.f19093a
            java.lang.String r4 = "Please for CurrencyManager us initialize() before getting the instance."
            java.util.Objects.requireNonNull(r2, r4)
            nd.q r2 = p238nd.C4770q.f19093a
            p214m2.C4339q.m9704i(r2)
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            r1 = 6
            java.lang.String r12 = p238nd.C4770q.m10831a(r2, r0, r12, r12, r1)
            r0 = 128(0x80, float:1.8E-43)
            r2 = r14
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r9
            r9 = r10
            r10 = r11
            r11 = r13
            r13 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return r14
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = "AtomicAssetForList(asset_id="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.lang.String r1 = r3.asset_id
            r0.append(r1)
            java.lang.String r1 = ", data="
            r0.append(r1)
            xf.e$c r1 = r3.data
            r0.append(r1)
            java.lang.String r1 = ", name="
            r0.append(r1)
            java.lang.String r1 = r3.name
            r0.append(r1)
            java.lang.String r1 = ", owner="
            r0.append(r1)
            java.lang.String r1 = r3.owner
            r0.append(r1)
            java.lang.String r1 = ", template_mint="
            r0.append(r1)
            java.lang.String r1 = r3.template_mint
            r0.append(r1)
            java.lang.String r1 = ", collection="
            r0.append(r1)
            xf.e$b r1 = r3.collection
            r0.append(r1)
            java.lang.String r1 = ", template="
            r0.append(r1)
            xf.e$d r1 = r3.template
            r0.append(r1)
            java.lang.String r1 = ", prices="
            r0.append(r1)
            java.util.List<xf.e$a> r1 = r3.prices
            r2 = 41
            java.lang.String r0 = p213m1.C4320f.m9652a(r0, r1, r2)
            return r0
    }
}
