package p438yg;

/* renamed from: yg.a */
/* loaded from: classes.dex */
public final class C7203a {
    private final java.lang.String code;
    private final java.lang.Integer index_position;
    private final boolean json;
    private final java.lang.String key_type;
    private final int limit;
    private final java.lang.String lower_bound;
    private final java.lang.String scope;
    private final java.lang.String table;
    private final java.lang.String upper_bound;

    public C7203a(java.lang.String r2, java.lang.String r3, java.lang.String r4, boolean r5, int r6, java.lang.String r7, java.lang.String r8, java.lang.Integer r9, java.lang.String r10) {
            r1 = this;
            java.lang.String r0 = "code"
            p214m2.C4339q.m9706k(r2, r0)
            java.lang.String r0 = "table"
            p214m2.C4339q.m9706k(r3, r0)
            java.lang.String r0 = "scope"
            p214m2.C4339q.m9706k(r4, r0)
            r1.<init>()
            r1.code = r2
            r1.table = r3
            r1.scope = r4
            r1.json = r5
            r1.limit = r6
            r1.lower_bound = r7
            r1.upper_bound = r8
            r1.index_position = r9
            r1.key_type = r10
            return
    }

    public /* synthetic */ C7203a(java.lang.String r12, java.lang.String r13, java.lang.String r14, boolean r15, int r16, java.lang.String r17, java.lang.String r18, java.lang.Integer r19, java.lang.String r20, int r21, p239nh.C4826f r22) {
            r11 = this;
            r0 = r21 & 8
            if (r0 == 0) goto L7
            r0 = 1
            r5 = 1
            goto L8
        L7:
            r5 = r15
        L8:
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r14
            r6 = r16
            r7 = r17
            r8 = r18
            r9 = r19
            r10 = r20
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
    }

    public static /* synthetic */ p438yg.C7203a copy$default(p438yg.C7203a r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, boolean r14, int r15, java.lang.String r16, java.lang.String r17, java.lang.Integer r18, java.lang.String r19, int r20, java.lang.Object r21) {
            r0 = r10
            r1 = r20
            r2 = r1 & 1
            if (r2 == 0) goto La
            java.lang.String r2 = r0.code
            goto Lb
        La:
            r2 = r11
        Lb:
            r3 = r1 & 2
            if (r3 == 0) goto L12
            java.lang.String r3 = r0.table
            goto L13
        L12:
            r3 = r12
        L13:
            r4 = r1 & 4
            if (r4 == 0) goto L1a
            java.lang.String r4 = r0.scope
            goto L1b
        L1a:
            r4 = r13
        L1b:
            r5 = r1 & 8
            if (r5 == 0) goto L22
            boolean r5 = r0.json
            goto L23
        L22:
            r5 = r14
        L23:
            r6 = r1 & 16
            if (r6 == 0) goto L2a
            int r6 = r0.limit
            goto L2b
        L2a:
            r6 = r15
        L2b:
            r7 = r1 & 32
            if (r7 == 0) goto L32
            java.lang.String r7 = r0.lower_bound
            goto L34
        L32:
            r7 = r16
        L34:
            r8 = r1 & 64
            if (r8 == 0) goto L3b
            java.lang.String r8 = r0.upper_bound
            goto L3d
        L3b:
            r8 = r17
        L3d:
            r9 = r1 & 128(0x80, float:1.8E-43)
            if (r9 == 0) goto L44
            java.lang.Integer r9 = r0.index_position
            goto L46
        L44:
            r9 = r18
        L46:
            r1 = r1 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L4d
            java.lang.String r1 = r0.key_type
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
            yg.a r0 = r10.copy(r11, r12, r13, r14, r15, r16, r17, r18, r19)
            return r0
    }

    public final java.lang.String component1() {
            r1 = this;
            java.lang.String r0 = r1.code
            return r0
    }

    public final java.lang.String component2() {
            r1 = this;
            java.lang.String r0 = r1.table
            return r0
    }

    public final java.lang.String component3() {
            r1 = this;
            java.lang.String r0 = r1.scope
            return r0
    }

    public final boolean component4() {
            r1 = this;
            boolean r0 = r1.json
            return r0
    }

    public final int component5() {
            r1 = this;
            int r0 = r1.limit
            return r0
    }

    public final java.lang.String component6() {
            r1 = this;
            java.lang.String r0 = r1.lower_bound
            return r0
    }

    public final java.lang.String component7() {
            r1 = this;
            java.lang.String r0 = r1.upper_bound
            return r0
    }

    public final java.lang.Integer component8() {
            r1 = this;
            java.lang.Integer r0 = r1.index_position
            return r0
    }

    public final java.lang.String component9() {
            r1 = this;
            java.lang.String r0 = r1.key_type
            return r0
    }

    public final p438yg.C7203a copy(java.lang.String r12, java.lang.String r13, java.lang.String r14, boolean r15, int r16, java.lang.String r17, java.lang.String r18, java.lang.Integer r19, java.lang.String r20) {
            r11 = this;
            java.lang.String r0 = "code"
            r2 = r12
            p214m2.C4339q.m9706k(r12, r0)
            java.lang.String r0 = "table"
            r3 = r13
            p214m2.C4339q.m9706k(r13, r0)
            java.lang.String r0 = "scope"
            r4 = r14
            p214m2.C4339q.m9706k(r14, r0)
            yg.a r0 = new yg.a
            r1 = r0
            r5 = r15
            r6 = r16
            r7 = r17
            r8 = r18
            r9 = r19
            r10 = r20
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return r0
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof p438yg.C7203a
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            yg.a r5 = (p438yg.C7203a) r5
            java.lang.String r1 = r4.code
            java.lang.String r3 = r5.code
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.String r1 = r4.table
            java.lang.String r3 = r5.table
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            java.lang.String r1 = r4.scope
            java.lang.String r3 = r5.scope
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L2d
            return r2
        L2d:
            boolean r1 = r4.json
            boolean r3 = r5.json
            if (r1 == r3) goto L34
            return r2
        L34:
            int r1 = r4.limit
            int r3 = r5.limit
            if (r1 == r3) goto L3b
            return r2
        L3b:
            java.lang.String r1 = r4.lower_bound
            java.lang.String r3 = r5.lower_bound
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L46
            return r2
        L46:
            java.lang.String r1 = r4.upper_bound
            java.lang.String r3 = r5.upper_bound
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L51
            return r2
        L51:
            java.lang.Integer r1 = r4.index_position
            java.lang.Integer r3 = r5.index_position
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L5c
            return r2
        L5c:
            java.lang.String r1 = r4.key_type
            java.lang.String r5 = r5.key_type
            boolean r5 = p214m2.C4339q.m9702c(r1, r5)
            if (r5 != 0) goto L67
            return r2
        L67:
            return r0
    }

    public final java.lang.String getCode() {
            r1 = this;
            java.lang.String r0 = r1.code
            return r0
    }

    public final java.lang.Integer getIndex_position() {
            r1 = this;
            java.lang.Integer r0 = r1.index_position
            return r0
    }

    public final boolean getJson() {
            r1 = this;
            boolean r0 = r1.json
            return r0
    }

    public final java.lang.String getKey_type() {
            r1 = this;
            java.lang.String r0 = r1.key_type
            return r0
    }

    public final int getLimit() {
            r1 = this;
            int r0 = r1.limit
            return r0
    }

    public final java.lang.String getLower_bound() {
            r1 = this;
            java.lang.String r0 = r1.lower_bound
            return r0
    }

    public final java.lang.String getScope() {
            r1 = this;
            java.lang.String r0 = r1.scope
            return r0
    }

    public final java.lang.String getTable() {
            r1 = this;
            java.lang.String r0 = r1.table
            return r0
    }

    public final java.lang.String getUpper_bound() {
            r1 = this;
            java.lang.String r0 = r1.upper_bound
            return r0
    }

    public int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.code
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.lang.String r1 = r3.table
            r2 = 31
            int r0 = p213m1.C4319e.m9651a(r1, r0, r2)
            java.lang.String r1 = r3.scope
            int r0 = p213m1.C4319e.m9651a(r1, r0, r2)
            boolean r1 = r3.json
            if (r1 == 0) goto L1b
            r1 = 1
        L1b:
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r3.limit
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.lang.String r1 = r3.lower_bound
            r2 = 0
            if (r1 != 0) goto L2a
            r1 = 0
            goto L2e
        L2a:
            int r1 = r1.hashCode()
        L2e:
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.lang.String r1 = r3.upper_bound
            if (r1 != 0) goto L37
            r1 = 0
            goto L3b
        L37:
            int r1 = r1.hashCode()
        L3b:
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.lang.Integer r1 = r3.index_position
            if (r1 != 0) goto L44
            r1 = 0
            goto L48
        L44:
            int r1 = r1.hashCode()
        L48:
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.lang.String r1 = r3.key_type
            if (r1 != 0) goto L50
            goto L54
        L50:
            int r2 = r1.hashCode()
        L54:
            int r0 = r0 + r2
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = "RequestBody(code="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.lang.String r1 = r3.code
            r0.append(r1)
            java.lang.String r1 = ", table="
            r0.append(r1)
            java.lang.String r1 = r3.table
            r0.append(r1)
            java.lang.String r1 = ", scope="
            r0.append(r1)
            java.lang.String r1 = r3.scope
            r0.append(r1)
            java.lang.String r1 = ", json="
            r0.append(r1)
            boolean r1 = r3.json
            r0.append(r1)
            java.lang.String r1 = ", limit="
            r0.append(r1)
            int r1 = r3.limit
            r0.append(r1)
            java.lang.String r1 = ", lower_bound="
            r0.append(r1)
            java.lang.String r1 = r3.lower_bound
            r0.append(r1)
            java.lang.String r1 = ", upper_bound="
            r0.append(r1)
            java.lang.String r1 = r3.upper_bound
            r0.append(r1)
            java.lang.String r1 = ", index_position="
            r0.append(r1)
            java.lang.Integer r1 = r3.index_position
            r0.append(r1)
            java.lang.String r1 = ", key_type="
            r0.append(r1)
            java.lang.String r1 = r3.key_type
            r2 = 41
            java.lang.String r0 = p185k7.C3814g5.m8552a(r0, r1, r2)
            return r0
    }
}
