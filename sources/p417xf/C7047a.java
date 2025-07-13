package p417xf;

/* renamed from: xf.a */
/* loaded from: classes.dex */
public final class C7047a {
    private final java.lang.String asset_id;
    private final p417xf.C7047a.a collection;
    private final java.lang.String contract;
    private final java.util.Map<java.lang.String, java.lang.Object> mutable_data;
    private final java.lang.String name;
    private final java.lang.String owner;
    private final p417xf.C7047a.b schema;
    private final p417xf.C7047a.c template;
    private final java.lang.String template_mint;

    /* renamed from: xf.a$a */
    public static final class a {
        private final java.lang.String collection_name;

        public a(java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = "collection_name"
                p214m2.C4339q.m9706k(r2, r0)
                r1.<init>()
                r1.collection_name = r2
                return
        }

        public static /* synthetic */ p417xf.C7047a.a copy$default(p417xf.C7047a.a r0, java.lang.String r1, int r2, java.lang.Object r3) {
                r2 = r2 & 1
                if (r2 == 0) goto L6
                java.lang.String r1 = r0.collection_name
            L6:
                xf.a$a r0 = r0.copy(r1)
                return r0
        }

        public final java.lang.String component1() {
                r1 = this;
                java.lang.String r0 = r1.collection_name
                return r0
        }

        public final p417xf.C7047a.a copy(java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = "collection_name"
                p214m2.C4339q.m9706k(r2, r0)
                xf.a$a r0 = new xf.a$a
                r0.<init>(r2)
                return r0
        }

        public boolean equals(java.lang.Object r4) {
                r3 = this;
                r0 = 1
                if (r3 != r4) goto L4
                return r0
            L4:
                boolean r1 = r4 instanceof p417xf.C7047a.a
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                xf.a$a r4 = (p417xf.C7047a.a) r4
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
                int r0 = r0.hashCode()
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

    /* renamed from: xf.a$b */
    public static final class b {
        private final java.lang.String schema_name;

        public b(java.lang.String r1) {
                r0 = this;
                r0.<init>()
                r0.schema_name = r1
                return
        }

        public static /* synthetic */ p417xf.C7047a.b copy$default(p417xf.C7047a.b r0, java.lang.String r1, int r2, java.lang.Object r3) {
                r2 = r2 & 1
                if (r2 == 0) goto L6
                java.lang.String r1 = r0.schema_name
            L6:
                xf.a$b r0 = r0.copy(r1)
                return r0
        }

        public final java.lang.String component1() {
                r1 = this;
                java.lang.String r0 = r1.schema_name
                return r0
        }

        public final p417xf.C7047a.b copy(java.lang.String r2) {
                r1 = this;
                xf.a$b r0 = new xf.a$b
                r0.<init>(r2)
                return r0
        }

        public boolean equals(java.lang.Object r4) {
                r3 = this;
                r0 = 1
                if (r3 != r4) goto L4
                return r0
            L4:
                boolean r1 = r4 instanceof p417xf.C7047a.b
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                xf.a$b r4 = (p417xf.C7047a.b) r4
                java.lang.String r1 = r3.schema_name
                java.lang.String r4 = r4.schema_name
                boolean r4 = p214m2.C4339q.m9702c(r1, r4)
                if (r4 != 0) goto L17
                return r2
            L17:
                return r0
        }

        public final java.lang.String getSchema_name() {
                r1 = this;
                java.lang.String r0 = r1.schema_name
                return r0
        }

        public int hashCode() {
                r1 = this;
                java.lang.String r0 = r1.schema_name
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
                java.lang.String r0 = "Schema(schema_name="
                java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
                java.lang.String r1 = r3.schema_name
                r2 = 41
                java.lang.String r0 = p185k7.C3814g5.m8552a(r0, r1, r2)
                return r0
        }
    }

    /* renamed from: xf.a$c */
    public static final class c {
        private final java.util.Map<java.lang.String, java.lang.Object> immutable_data;
        private final boolean is_burnable;
        private final boolean is_transferable;
        private final java.lang.String issued_supply;
        private final java.lang.String max_supply;
        private final java.lang.String template_id;

        public c(java.lang.String r2, java.util.Map<java.lang.String, ? extends java.lang.Object> r3, boolean r4, boolean r5, java.lang.String r6, java.lang.String r7) {
                r1 = this;
                java.lang.String r0 = "immutable_data"
                p214m2.C4339q.m9706k(r3, r0)
                java.lang.String r0 = "issued_supply"
                p214m2.C4339q.m9706k(r6, r0)
                java.lang.String r0 = "max_supply"
                p214m2.C4339q.m9706k(r7, r0)
                r1.<init>()
                r1.template_id = r2
                r1.immutable_data = r3
                r1.is_burnable = r4
                r1.is_transferable = r5
                r1.issued_supply = r6
                r1.max_supply = r7
                return
        }

        public static /* synthetic */ p417xf.C7047a.c copy$default(p417xf.C7047a.c r4, java.lang.String r5, java.util.Map r6, boolean r7, boolean r8, java.lang.String r9, java.lang.String r10, int r11, java.lang.Object r12) {
                r12 = r11 & 1
                if (r12 == 0) goto L6
                java.lang.String r5 = r4.template_id
            L6:
                r12 = r11 & 2
                if (r12 == 0) goto Lc
                java.util.Map<java.lang.String, java.lang.Object> r6 = r4.immutable_data
            Lc:
                r12 = r6
                r6 = r11 & 4
                if (r6 == 0) goto L13
                boolean r7 = r4.is_burnable
            L13:
                r0 = r7
                r6 = r11 & 8
                if (r6 == 0) goto L1a
                boolean r8 = r4.is_transferable
            L1a:
                r1 = r8
                r6 = r11 & 16
                if (r6 == 0) goto L21
                java.lang.String r9 = r4.issued_supply
            L21:
                r2 = r9
                r6 = r11 & 32
                if (r6 == 0) goto L28
                java.lang.String r10 = r4.max_supply
            L28:
                r3 = r10
                r6 = r4
                r7 = r5
                r8 = r12
                r9 = r0
                r10 = r1
                r11 = r2
                r12 = r3
                xf.a$c r4 = r6.copy(r7, r8, r9, r10, r11, r12)
                return r4
        }

        public final java.lang.String component1() {
                r1 = this;
                java.lang.String r0 = r1.template_id
                return r0
        }

        public final java.util.Map<java.lang.String, java.lang.Object> component2() {
                r1 = this;
                java.util.Map<java.lang.String, java.lang.Object> r0 = r1.immutable_data
                return r0
        }

        public final boolean component3() {
                r1 = this;
                boolean r0 = r1.is_burnable
                return r0
        }

        public final boolean component4() {
                r1 = this;
                boolean r0 = r1.is_transferable
                return r0
        }

        public final java.lang.String component5() {
                r1 = this;
                java.lang.String r0 = r1.issued_supply
                return r0
        }

        public final java.lang.String component6() {
                r1 = this;
                java.lang.String r0 = r1.max_supply
                return r0
        }

        public final p417xf.C7047a.c copy(java.lang.String r9, java.util.Map<java.lang.String, ? extends java.lang.Object> r10, boolean r11, boolean r12, java.lang.String r13, java.lang.String r14) {
                r8 = this;
                java.lang.String r0 = "immutable_data"
                p214m2.C4339q.m9706k(r10, r0)
                java.lang.String r0 = "issued_supply"
                p214m2.C4339q.m9706k(r13, r0)
                java.lang.String r0 = "max_supply"
                p214m2.C4339q.m9706k(r14, r0)
                xf.a$c r0 = new xf.a$c
                r1 = r0
                r2 = r9
                r3 = r10
                r4 = r11
                r5 = r12
                r6 = r13
                r7 = r14
                r1.<init>(r2, r3, r4, r5, r6, r7)
                return r0
        }

        public boolean equals(java.lang.Object r5) {
                r4 = this;
                r0 = 1
                if (r4 != r5) goto L4
                return r0
            L4:
                boolean r1 = r5 instanceof p417xf.C7047a.c
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                xf.a$c r5 = (p417xf.C7047a.c) r5
                java.lang.String r1 = r4.template_id
                java.lang.String r3 = r5.template_id
                boolean r1 = p214m2.C4339q.m9702c(r1, r3)
                if (r1 != 0) goto L17
                return r2
            L17:
                java.util.Map<java.lang.String, java.lang.Object> r1 = r4.immutable_data
                java.util.Map<java.lang.String, java.lang.Object> r3 = r5.immutable_data
                boolean r1 = p214m2.C4339q.m9702c(r1, r3)
                if (r1 != 0) goto L22
                return r2
            L22:
                boolean r1 = r4.is_burnable
                boolean r3 = r5.is_burnable
                if (r1 == r3) goto L29
                return r2
            L29:
                boolean r1 = r4.is_transferable
                boolean r3 = r5.is_transferable
                if (r1 == r3) goto L30
                return r2
            L30:
                java.lang.String r1 = r4.issued_supply
                java.lang.String r3 = r5.issued_supply
                boolean r1 = p214m2.C4339q.m9702c(r1, r3)
                if (r1 != 0) goto L3b
                return r2
            L3b:
                java.lang.String r1 = r4.max_supply
                java.lang.String r5 = r5.max_supply
                boolean r5 = p214m2.C4339q.m9702c(r1, r5)
                if (r5 != 0) goto L46
                return r2
            L46:
                return r0
        }

        public final java.util.Map<java.lang.String, java.lang.Object> getImmutable_data() {
                r1 = this;
                java.util.Map<java.lang.String, java.lang.Object> r0 = r1.immutable_data
                return r0
        }

        public final java.lang.String getIssued_supply() {
                r1 = this;
                java.lang.String r0 = r1.issued_supply
                return r0
        }

        public final java.lang.String getMax_supply() {
                r1 = this;
                java.lang.String r0 = r1.max_supply
                return r0
        }

        public final java.lang.String getTemplate_id() {
                r1 = this;
                java.lang.String r0 = r1.template_id
                return r0
        }

        public int hashCode() {
                r3 = this;
                java.lang.String r0 = r3.template_id
                if (r0 != 0) goto L6
                r0 = 0
                goto La
            L6:
                int r0 = r0.hashCode()
            La:
                int r0 = r0 * 31
                java.util.Map<java.lang.String, java.lang.Object> r1 = r3.immutable_data
                int r1 = r1.hashCode()
                int r1 = r1 + r0
                int r1 = r1 * 31
                boolean r0 = r3.is_burnable
                r2 = 1
                if (r0 == 0) goto L1b
                r0 = 1
            L1b:
                int r1 = r1 + r0
                int r1 = r1 * 31
                boolean r0 = r3.is_transferable
                if (r0 == 0) goto L23
                goto L24
            L23:
                r2 = r0
            L24:
                int r1 = r1 + r2
                int r1 = r1 * 31
                java.lang.String r0 = r3.issued_supply
                r2 = 31
                int r0 = p213m1.C4319e.m9651a(r0, r1, r2)
                java.lang.String r1 = r3.max_supply
                int r1 = r1.hashCode()
                int r1 = r1 + r0
                return r1
        }

        public final boolean is_burnable() {
                r1 = this;
                boolean r0 = r1.is_burnable
                return r0
        }

        public final boolean is_transferable() {
                r1 = this;
                boolean r0 = r1.is_transferable
                return r0
        }

        public java.lang.String toString() {
                r3 = this;
                java.lang.String r0 = "Template(template_id="
                java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
                java.lang.String r1 = r3.template_id
                r0.append(r1)
                java.lang.String r1 = ", immutable_data="
                r0.append(r1)
                java.util.Map<java.lang.String, java.lang.Object> r1 = r3.immutable_data
                r0.append(r1)
                java.lang.String r1 = ", is_burnable="
                r0.append(r1)
                boolean r1 = r3.is_burnable
                r0.append(r1)
                java.lang.String r1 = ", is_transferable="
                r0.append(r1)
                boolean r1 = r3.is_transferable
                r0.append(r1)
                java.lang.String r1 = ", issued_supply="
                r0.append(r1)
                java.lang.String r1 = r3.issued_supply
                r0.append(r1)
                java.lang.String r1 = ", max_supply="
                r0.append(r1)
                java.lang.String r1 = r3.max_supply
                r2 = 41
                java.lang.String r0 = p185k7.C3814g5.m8552a(r0, r1, r2)
                return r0
        }
    }

    public C7047a(java.lang.String r2, p417xf.C7047a.a r3, java.lang.String r4, java.util.Map<java.lang.String, ? extends java.lang.Object> r5, java.lang.String r6, p417xf.C7047a.b r7, java.lang.String r8, p417xf.C7047a.c r9, java.lang.String r10) {
            r1 = this;
            java.lang.String r0 = "asset_id"
            p214m2.C4339q.m9706k(r2, r0)
            java.lang.String r0 = "collection"
            p214m2.C4339q.m9706k(r3, r0)
            java.lang.String r0 = "contract"
            p214m2.C4339q.m9706k(r4, r0)
            java.lang.String r0 = "name"
            p214m2.C4339q.m9706k(r6, r0)
            java.lang.String r0 = "owner"
            p214m2.C4339q.m9706k(r8, r0)
            java.lang.String r0 = "template"
            p214m2.C4339q.m9706k(r9, r0)
            java.lang.String r0 = "template_mint"
            p214m2.C4339q.m9706k(r10, r0)
            r1.<init>()
            r1.asset_id = r2
            r1.collection = r3
            r1.contract = r4
            r1.mutable_data = r5
            r1.name = r6
            r1.schema = r7
            r1.owner = r8
            r1.template = r9
            r1.template_mint = r10
            return
    }

    public static /* synthetic */ p417xf.C7047a copy$default(p417xf.C7047a r10, java.lang.String r11, p417xf.C7047a.a r12, java.lang.String r13, java.util.Map r14, java.lang.String r15, p417xf.C7047a.b r16, java.lang.String r17, p417xf.C7047a.c r18, java.lang.String r19, int r20, java.lang.Object r21) {
            r0 = r10
            r1 = r20
            r2 = r1 & 1
            if (r2 == 0) goto La
            java.lang.String r2 = r0.asset_id
            goto Lb
        La:
            r2 = r11
        Lb:
            r3 = r1 & 2
            if (r3 == 0) goto L12
            xf.a$a r3 = r0.collection
            goto L13
        L12:
            r3 = r12
        L13:
            r4 = r1 & 4
            if (r4 == 0) goto L1a
            java.lang.String r4 = r0.contract
            goto L1b
        L1a:
            r4 = r13
        L1b:
            r5 = r1 & 8
            if (r5 == 0) goto L22
            java.util.Map<java.lang.String, java.lang.Object> r5 = r0.mutable_data
            goto L23
        L22:
            r5 = r14
        L23:
            r6 = r1 & 16
            if (r6 == 0) goto L2a
            java.lang.String r6 = r0.name
            goto L2b
        L2a:
            r6 = r15
        L2b:
            r7 = r1 & 32
            if (r7 == 0) goto L32
            xf.a$b r7 = r0.schema
            goto L34
        L32:
            r7 = r16
        L34:
            r8 = r1 & 64
            if (r8 == 0) goto L3b
            java.lang.String r8 = r0.owner
            goto L3d
        L3b:
            r8 = r17
        L3d:
            r9 = r1 & 128(0x80, float:1.8E-43)
            if (r9 == 0) goto L44
            xf.a$c r9 = r0.template
            goto L46
        L44:
            r9 = r18
        L46:
            r1 = r1 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L4d
            java.lang.String r1 = r0.template_mint
            goto L4f
        L4d:
            r1 = r19
        L4f:
            r11 = r2
            r12 = r3
            r13 = r4
            r14 = r5
            r15 = r6
            r16 = r7
            r17 = r8
            r18 = r9
            r19 = r1
            xf.a r0 = r10.copy(r11, r12, r13, r14, r15, r16, r17, r18, r19)
            return r0
    }

    private final ch.C0978e<java.lang.String, io.tacocrypto.app.p156ui.tools.nftwallet.detail.EnumC3335o> getItemAsset(java.lang.Object r2, io.tacocrypto.app.p156ui.tools.nftwallet.detail.EnumC3335o r3) {
            r1 = this;
            if (r2 != 0) goto L4
            r2 = 0
            return r2
        L4:
            java.lang.String r2 = r2.toString()
            java.lang.String r2 = p417xf.C7067u.getAssetUrlIpfs(r2)
            ch.e r0 = new ch.e
            r0.<init>(r2, r3)
            return r0
    }

    public final java.lang.String component1() {
            r1 = this;
            java.lang.String r0 = r1.asset_id
            return r0
    }

    public final p417xf.C7047a.a component2() {
            r1 = this;
            xf.a$a r0 = r1.collection
            return r0
    }

    public final java.lang.String component3() {
            r1 = this;
            java.lang.String r0 = r1.contract
            return r0
    }

    public final java.util.Map<java.lang.String, java.lang.Object> component4() {
            r1 = this;
            java.util.Map<java.lang.String, java.lang.Object> r0 = r1.mutable_data
            return r0
    }

    public final java.lang.String component5() {
            r1 = this;
            java.lang.String r0 = r1.name
            return r0
    }

    public final p417xf.C7047a.b component6() {
            r1 = this;
            xf.a$b r0 = r1.schema
            return r0
    }

    public final java.lang.String component7() {
            r1 = this;
            java.lang.String r0 = r1.owner
            return r0
    }

    public final p417xf.C7047a.c component8() {
            r1 = this;
            xf.a$c r0 = r1.template
            return r0
    }

    public final java.lang.String component9() {
            r1 = this;
            java.lang.String r0 = r1.template_mint
            return r0
    }

    public final p417xf.C7047a copy(java.lang.String r12, p417xf.C7047a.a r13, java.lang.String r14, java.util.Map<java.lang.String, ? extends java.lang.Object> r15, java.lang.String r16, p417xf.C7047a.b r17, java.lang.String r18, p417xf.C7047a.c r19, java.lang.String r20) {
            r11 = this;
            java.lang.String r0 = "asset_id"
            r2 = r12
            p214m2.C4339q.m9706k(r12, r0)
            java.lang.String r0 = "collection"
            r3 = r13
            p214m2.C4339q.m9706k(r13, r0)
            java.lang.String r0 = "contract"
            r4 = r14
            p214m2.C4339q.m9706k(r14, r0)
            java.lang.String r0 = "name"
            r6 = r16
            p214m2.C4339q.m9706k(r6, r0)
            java.lang.String r0 = "owner"
            r8 = r18
            p214m2.C4339q.m9706k(r8, r0)
            java.lang.String r0 = "template"
            r9 = r19
            p214m2.C4339q.m9706k(r9, r0)
            java.lang.String r0 = "template_mint"
            r10 = r20
            p214m2.C4339q.m9706k(r10, r0)
            xf.a r0 = new xf.a
            r1 = r0
            r5 = r15
            r7 = r17
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return r0
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof p417xf.C7047a
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            xf.a r5 = (p417xf.C7047a) r5
            java.lang.String r1 = r4.asset_id
            java.lang.String r3 = r5.asset_id
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            xf.a$a r1 = r4.collection
            xf.a$a r3 = r5.collection
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
            java.util.Map<java.lang.String, java.lang.Object> r1 = r4.mutable_data
            java.util.Map<java.lang.String, java.lang.Object> r3 = r5.mutable_data
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L38
            return r2
        L38:
            java.lang.String r1 = r4.name
            java.lang.String r3 = r5.name
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L43
            return r2
        L43:
            xf.a$b r1 = r4.schema
            xf.a$b r3 = r5.schema
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L4e
            return r2
        L4e:
            java.lang.String r1 = r4.owner
            java.lang.String r3 = r5.owner
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L59
            return r2
        L59:
            xf.a$c r1 = r4.template
            xf.a$c r3 = r5.template
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L64
            return r2
        L64:
            java.lang.String r1 = r4.template_mint
            java.lang.String r5 = r5.template_mint
            boolean r5 = p214m2.C4339q.m9702c(r1, r5)
            if (r5 != 0) goto L6f
            return r2
        L6f:
            return r0
    }

    public final java.lang.String getAsset_id() {
            r1 = this;
            java.lang.String r0 = r1.asset_id
            return r0
    }

    public final java.util.List<ch.C0978e<java.lang.String, io.tacocrypto.app.p156ui.tools.nftwallet.detail.EnumC3335o>> getAssetsList() {
            r5 = this;
            io.tacocrypto.app.ui.tools.nftwallet.detail.o r0 = io.tacocrypto.app.p156ui.tools.nftwallet.detail.EnumC3335o.f14463Y
            r1 = 9
            ch.e[] r1 = new ch.C0978e[r1]
            xf.a$c r2 = r5.template
            java.util.Map r2 = r2.getImmutable_data()
            java.lang.String r3 = "video"
            java.lang.Object r2 = r2.get(r3)
            io.tacocrypto.app.ui.tools.nftwallet.detail.o r3 = io.tacocrypto.app.p156ui.tools.nftwallet.detail.EnumC3335o.f14464Z
            ch.e r2 = r5.getItemAsset(r2, r3)
            r3 = 0
            r1[r3] = r2
            java.util.Map<java.lang.String, java.lang.Object> r2 = r5.mutable_data
            java.lang.String r3 = "img"
            if (r2 == 0) goto L2d
            java.lang.Object r2 = r2.get(r3)
            if (r2 == 0) goto L2d
            ch.e r2 = r5.getItemAsset(r2, r0)
            if (r2 != 0) goto L3b
        L2d:
            xf.a$c r2 = r5.template
            java.util.Map r2 = r2.getImmutable_data()
            java.lang.Object r2 = r2.get(r3)
            ch.e r2 = r5.getItemAsset(r2, r0)
        L3b:
            r3 = 1
            r1[r3] = r2
            r2 = 2
            xf.a$c r3 = r5.template
            java.util.Map r3 = r3.getImmutable_data()
            java.lang.String r4 = "gif"
            java.lang.Object r3 = r3.get(r4)
            ch.e r3 = r5.getItemAsset(r3, r0)
            r1[r2] = r3
            r2 = 3
            xf.a$c r3 = r5.template
            java.util.Map r3 = r3.getImmutable_data()
            java.lang.String r4 = "original_image"
            java.lang.Object r3 = r3.get(r4)
            ch.e r3 = r5.getItemAsset(r3, r0)
            r1[r2] = r3
            r2 = 4
            xf.a$c r3 = r5.template
            java.util.Map r3 = r3.getImmutable_data()
            java.lang.String r4 = "static_img"
            java.lang.Object r3 = r3.get(r4)
            ch.e r3 = r5.getItemAsset(r3, r0)
            r1[r2] = r3
            r2 = 5
            xf.a$c r3 = r5.template
            java.util.Map r3 = r3.getImmutable_data()
            java.lang.String r4 = "img_back"
            java.lang.Object r3 = r3.get(r4)
            ch.e r3 = r5.getItemAsset(r3, r0)
            r1[r2] = r3
            r2 = 6
            xf.a$c r3 = r5.template
            java.util.Map r3 = r3.getImmutable_data()
            java.lang.String r4 = "backimg"
            java.lang.Object r3 = r3.get(r4)
            ch.e r3 = r5.getItemAsset(r3, r0)
            r1[r2] = r3
            r2 = 7
            xf.a$c r3 = r5.template
            java.util.Map r3 = r3.getImmutable_data()
            java.lang.String r4 = "back_img"
            java.lang.Object r3 = r3.get(r4)
            ch.e r3 = r5.getItemAsset(r3, r0)
            r1[r2] = r3
            r2 = 8
            xf.a$c r3 = r5.template
            java.util.Map r3 = r3.getImmutable_data()
            java.lang.String r4 = "info_img"
            java.lang.Object r3 = r3.get(r4)
            ch.e r0 = r5.getItemAsset(r3, r0)
            r1[r2] = r0
            java.util.List r0 = p074e9.C1805a.m4530o(r1)
            return r0
    }

    public final p417xf.C7047a.a getCollection() {
            r1 = this;
            xf.a$a r0 = r1.collection
            return r0
    }

    public final java.lang.String getContract() {
            r1 = this;
            java.lang.String r0 = r1.contract
            return r0
    }

    public final java.lang.String getMintLabel() {
            r3 = this;
            xf.a$c r0 = r3.template
            java.lang.String r0 = r0.getMax_supply()
            java.lang.Integer r1 = p362uh.C6462h.m13049F(r0)
            if (r1 == 0) goto L11
            int r1 = r1.intValue()
            goto L12
        L11:
            r1 = 0
        L12:
            if (r1 > 0) goto L16
            java.lang.String r0 = "?"
        L16:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r3.template_mint
            r1.append(r2)
            java.lang.String r2 = " of "
            r1.append(r2)
            xf.a$c r2 = r3.template
            java.lang.String r2 = r2.getIssued_supply()
            r1.append(r2)
            java.lang.String r2 = " (max: "
            r1.append(r2)
            r1.append(r0)
            r0 = 41
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
    }

    public final java.util.Map<java.lang.String, java.lang.Object> getMutable_data() {
            r1 = this;
            java.util.Map<java.lang.String, java.lang.Object> r0 = r1.mutable_data
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

    public final java.lang.String getPropertiesLabel() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            xf.a$c r1 = r4.template
            boolean r1 = r1.is_transferable()
            java.lang.String r2 = ""
            java.lang.String r3 = "Not"
            if (r1 == 0) goto L13
            r1 = r2
            goto L14
        L13:
            r1 = r3
        L14:
            r0.append(r1)
            java.lang.String r1 = " Transferable - "
            r0.append(r1)
            xf.a$c r1 = r4.template
            boolean r1 = r1.is_burnable()
            if (r1 == 0) goto L25
            goto L26
        L25:
            r2 = r3
        L26:
            java.lang.String r1 = " Burnable"
            java.lang.String r0 = p346u.C6269n.m12888a(r0, r2, r1)
            return r0
    }

    public final p417xf.C7047a.b getSchema() {
            r1 = this;
            xf.a$b r0 = r1.schema
            return r0
    }

    public final p417xf.C7047a.c getTemplate() {
            r1 = this;
            xf.a$c r0 = r1.template
            return r0
    }

    public final java.lang.String getTemplate_mint() {
            r1 = this;
            java.lang.String r0 = r1.template_mint
            return r0
    }

    public int hashCode() {
            r4 = this;
            java.lang.String r0 = r4.asset_id
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            xf.a$a r1 = r4.collection
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.String r0 = r4.contract
            r2 = 31
            int r0 = p213m1.C4319e.m9651a(r0, r1, r2)
            java.util.Map<java.lang.String, java.lang.Object> r1 = r4.mutable_data
            r2 = 0
            if (r1 != 0) goto L20
            r1 = 0
            goto L24
        L20:
            int r1 = r1.hashCode()
        L24:
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.lang.String r1 = r4.name
            r3 = 31
            int r0 = p213m1.C4319e.m9651a(r1, r0, r3)
            xf.a$b r1 = r4.schema
            if (r1 != 0) goto L34
            goto L38
        L34:
            int r2 = r1.hashCode()
        L38:
            int r0 = r0 + r2
            int r0 = r0 * 31
            java.lang.String r1 = r4.owner
            r2 = 31
            int r0 = p213m1.C4319e.m9651a(r1, r0, r2)
            xf.a$c r1 = r4.template
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.String r0 = r4.template_mint
            int r0 = r0.hashCode()
            int r0 = r0 + r1
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = "AssetDetailModel(asset_id="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.lang.String r1 = r3.asset_id
            r0.append(r1)
            java.lang.String r1 = ", collection="
            r0.append(r1)
            xf.a$a r1 = r3.collection
            r0.append(r1)
            java.lang.String r1 = ", contract="
            r0.append(r1)
            java.lang.String r1 = r3.contract
            r0.append(r1)
            java.lang.String r1 = ", mutable_data="
            r0.append(r1)
            java.util.Map<java.lang.String, java.lang.Object> r1 = r3.mutable_data
            r0.append(r1)
            java.lang.String r1 = ", name="
            r0.append(r1)
            java.lang.String r1 = r3.name
            r0.append(r1)
            java.lang.String r1 = ", schema="
            r0.append(r1)
            xf.a$b r1 = r3.schema
            r0.append(r1)
            java.lang.String r1 = ", owner="
            r0.append(r1)
            java.lang.String r1 = r3.owner
            r0.append(r1)
            java.lang.String r1 = ", template="
            r0.append(r1)
            xf.a$c r1 = r3.template
            r0.append(r1)
            java.lang.String r1 = ", template_mint="
            r0.append(r1)
            java.lang.String r1 = r3.template_mint
            r2 = 41
            java.lang.String r0 = p185k7.C3814g5.m8552a(r0, r1, r2)
            return r0
    }
}
