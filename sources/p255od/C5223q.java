package p255od;

/* renamed from: od.q */
/* loaded from: classes.dex */
public final class C5223q {

    @p189kb.InterfaceC4079b("asset_id")
    private final java.lang.String assetID;
    private final java.lang.String contract;

    @p189kb.InterfaceC4079b("is_burnable")
    private final boolean isBurnable;

    @p189kb.InterfaceC4079b("is_transferable")
    private final boolean isTransferable;
    private final boolean name;
    private final java.lang.String owner;
    private final p255od.C5214l0 schema;

    @p189kb.InterfaceC4079b("template_mint")
    private final java.lang.String templateMint;

    public C5223q(java.lang.String r2, java.lang.String r3, java.lang.String r4, boolean r5, boolean r6, p255od.C5214l0 r7, java.lang.String r8, boolean r9) {
            r1 = this;
            java.lang.String r0 = "contract"
            p214m2.C4339q.m9706k(r2, r0)
            java.lang.String r0 = "assetID"
            p214m2.C4339q.m9706k(r3, r0)
            java.lang.String r0 = "owner"
            p214m2.C4339q.m9706k(r4, r0)
            java.lang.String r0 = "schema"
            p214m2.C4339q.m9706k(r7, r0)
            java.lang.String r0 = "templateMint"
            p214m2.C4339q.m9706k(r8, r0)
            r1.<init>()
            r1.contract = r2
            r1.assetID = r3
            r1.owner = r4
            r1.isTransferable = r5
            r1.isBurnable = r6
            r1.schema = r7
            r1.templateMint = r8
            r1.name = r9
            return
    }

    public static /* synthetic */ p255od.C5223q copy$default(p255od.C5223q r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, boolean r13, boolean r14, p255od.C5214l0 r15, java.lang.String r16, boolean r17, int r18, java.lang.Object r19) {
            r0 = r9
            r1 = r18
            r2 = r1 & 1
            if (r2 == 0) goto La
            java.lang.String r2 = r0.contract
            goto Lb
        La:
            r2 = r10
        Lb:
            r3 = r1 & 2
            if (r3 == 0) goto L12
            java.lang.String r3 = r0.assetID
            goto L13
        L12:
            r3 = r11
        L13:
            r4 = r1 & 4
            if (r4 == 0) goto L1a
            java.lang.String r4 = r0.owner
            goto L1b
        L1a:
            r4 = r12
        L1b:
            r5 = r1 & 8
            if (r5 == 0) goto L22
            boolean r5 = r0.isTransferable
            goto L23
        L22:
            r5 = r13
        L23:
            r6 = r1 & 16
            if (r6 == 0) goto L2a
            boolean r6 = r0.isBurnable
            goto L2b
        L2a:
            r6 = r14
        L2b:
            r7 = r1 & 32
            if (r7 == 0) goto L32
            od.l0 r7 = r0.schema
            goto L33
        L32:
            r7 = r15
        L33:
            r8 = r1 & 64
            if (r8 == 0) goto L3a
            java.lang.String r8 = r0.templateMint
            goto L3c
        L3a:
            r8 = r16
        L3c:
            r1 = r1 & 128(0x80, float:1.8E-43)
            if (r1 == 0) goto L43
            boolean r1 = r0.name
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
            od.q r0 = r9.copy(r10, r11, r12, r13, r14, r15, r16, r17)
            return r0
    }

    public final java.lang.String component1() {
            r1 = this;
            java.lang.String r0 = r1.contract
            return r0
    }

    public final java.lang.String component2() {
            r1 = this;
            java.lang.String r0 = r1.assetID
            return r0
    }

    public final java.lang.String component3() {
            r1 = this;
            java.lang.String r0 = r1.owner
            return r0
    }

    public final boolean component4() {
            r1 = this;
            boolean r0 = r1.isTransferable
            return r0
    }

    public final boolean component5() {
            r1 = this;
            boolean r0 = r1.isBurnable
            return r0
    }

    public final p255od.C5214l0 component6() {
            r1 = this;
            od.l0 r0 = r1.schema
            return r0
    }

    public final java.lang.String component7() {
            r1 = this;
            java.lang.String r0 = r1.templateMint
            return r0
    }

    public final boolean component8() {
            r1 = this;
            boolean r0 = r1.name
            return r0
    }

    public final p255od.C5223q copy(java.lang.String r11, java.lang.String r12, java.lang.String r13, boolean r14, boolean r15, p255od.C5214l0 r16, java.lang.String r17, boolean r18) {
            r10 = this;
            java.lang.String r0 = "contract"
            r2 = r11
            p214m2.C4339q.m9706k(r11, r0)
            java.lang.String r0 = "assetID"
            r3 = r12
            p214m2.C4339q.m9706k(r12, r0)
            java.lang.String r0 = "owner"
            r4 = r13
            p214m2.C4339q.m9706k(r13, r0)
            java.lang.String r0 = "schema"
            r7 = r16
            p214m2.C4339q.m9706k(r7, r0)
            java.lang.String r0 = "templateMint"
            r8 = r17
            p214m2.C4339q.m9706k(r8, r0)
            od.q r0 = new od.q
            r1 = r0
            r5 = r14
            r6 = r15
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
            boolean r1 = r5 instanceof p255od.C5223q
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            od.q r5 = (p255od.C5223q) r5
            java.lang.String r1 = r4.contract
            java.lang.String r3 = r5.contract
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.String r1 = r4.assetID
            java.lang.String r3 = r5.assetID
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            java.lang.String r1 = r4.owner
            java.lang.String r3 = r5.owner
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L2d
            return r2
        L2d:
            boolean r1 = r4.isTransferable
            boolean r3 = r5.isTransferable
            if (r1 == r3) goto L34
            return r2
        L34:
            boolean r1 = r4.isBurnable
            boolean r3 = r5.isBurnable
            if (r1 == r3) goto L3b
            return r2
        L3b:
            od.l0 r1 = r4.schema
            od.l0 r3 = r5.schema
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L46
            return r2
        L46:
            java.lang.String r1 = r4.templateMint
            java.lang.String r3 = r5.templateMint
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L51
            return r2
        L51:
            boolean r1 = r4.name
            boolean r5 = r5.name
            if (r1 == r5) goto L58
            return r2
        L58:
            return r0
    }

    public final java.lang.String getAssetID() {
            r1 = this;
            java.lang.String r0 = r1.assetID
            return r0
    }

    public final java.lang.String getContract() {
            r1 = this;
            java.lang.String r0 = r1.contract
            return r0
    }

    public final boolean getName() {
            r1 = this;
            boolean r0 = r1.name
            return r0
    }

    public final java.lang.String getOwner() {
            r1 = this;
            java.lang.String r0 = r1.owner
            return r0
    }

    public final p255od.C5214l0 getSchema() {
            r1 = this;
            od.l0 r0 = r1.schema
            return r0
    }

    public final java.lang.String getTemplateMint() {
            r1 = this;
            java.lang.String r0 = r1.templateMint
            return r0
    }

    public int hashCode() {
            r4 = this;
            java.lang.String r0 = r4.contract
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.lang.String r1 = r4.assetID
            r2 = 31
            int r0 = p213m1.C4319e.m9651a(r1, r0, r2)
            java.lang.String r1 = r4.owner
            int r0 = p213m1.C4319e.m9651a(r1, r0, r2)
            boolean r1 = r4.isTransferable
            r2 = 1
            if (r1 == 0) goto L1c
            r1 = 1
        L1c:
            int r0 = r0 + r1
            int r0 = r0 * 31
            boolean r1 = r4.isBurnable
            if (r1 == 0) goto L24
            r1 = 1
        L24:
            int r0 = r0 + r1
            int r0 = r0 * 31
            od.l0 r1 = r4.schema
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.String r0 = r4.templateMint
            r3 = 31
            int r0 = p213m1.C4319e.m9651a(r0, r1, r3)
            boolean r1 = r4.name
            if (r1 == 0) goto L3d
            goto L3e
        L3d:
            r2 = r1
        L3e:
            int r0 = r0 + r2
            return r0
    }

    public final boolean isBurnable() {
            r1 = this;
            boolean r0 = r1.isBurnable
            return r0
    }

    public final boolean isTransferable() {
            r1 = this;
            boolean r0 = r1.isTransferable
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = "Datum(contract="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.lang.String r1 = r2.contract
            r0.append(r1)
            java.lang.String r1 = ", assetID="
            r0.append(r1)
            java.lang.String r1 = r2.assetID
            r0.append(r1)
            java.lang.String r1 = ", owner="
            r0.append(r1)
            java.lang.String r1 = r2.owner
            r0.append(r1)
            java.lang.String r1 = ", isTransferable="
            r0.append(r1)
            boolean r1 = r2.isTransferable
            r0.append(r1)
            java.lang.String r1 = ", isBurnable="
            r0.append(r1)
            boolean r1 = r2.isBurnable
            r0.append(r1)
            java.lang.String r1 = ", schema="
            r0.append(r1)
            od.l0 r1 = r2.schema
            r0.append(r1)
            java.lang.String r1 = ", templateMint="
            r0.append(r1)
            java.lang.String r1 = r2.templateMint
            r0.append(r1)
            java.lang.String r1 = ", name="
            r0.append(r1)
            boolean r1 = r2.name
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
