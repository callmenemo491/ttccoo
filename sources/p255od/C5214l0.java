package p255od;

/* renamed from: od.l0 */
/* loaded from: classes.dex */
public final class C5214l0 {

    @p189kb.InterfaceC4079b("created_at_block")
    private final java.lang.String createdAtBlock;

    @p189kb.InterfaceC4079b("created_at_time")
    private final java.lang.String createdAtTime;
    private final java.util.List<java.lang.Object> format;

    @p189kb.InterfaceC4079b("schema_name")
    private final java.lang.String schemaName;

    public C5214l0(java.lang.String r2, java.util.List<java.lang.Object> r3, java.lang.String r4, java.lang.String r5) {
            r1 = this;
            java.lang.String r0 = "schemaName"
            p214m2.C4339q.m9706k(r2, r0)
            java.lang.String r0 = "format"
            p214m2.C4339q.m9706k(r3, r0)
            java.lang.String r0 = "createdAtBlock"
            p214m2.C4339q.m9706k(r4, r0)
            java.lang.String r0 = "createdAtTime"
            p214m2.C4339q.m9706k(r5, r0)
            r1.<init>()
            r1.schemaName = r2
            r1.format = r3
            r1.createdAtBlock = r4
            r1.createdAtTime = r5
            return
    }

    public static /* synthetic */ p255od.C5214l0 copy$default(p255od.C5214l0 r0, java.lang.String r1, java.util.List r2, java.lang.String r3, java.lang.String r4, int r5, java.lang.Object r6) {
            r6 = r5 & 1
            if (r6 == 0) goto L6
            java.lang.String r1 = r0.schemaName
        L6:
            r6 = r5 & 2
            if (r6 == 0) goto Lc
            java.util.List<java.lang.Object> r2 = r0.format
        Lc:
            r6 = r5 & 4
            if (r6 == 0) goto L12
            java.lang.String r3 = r0.createdAtBlock
        L12:
            r5 = r5 & 8
            if (r5 == 0) goto L18
            java.lang.String r4 = r0.createdAtTime
        L18:
            od.l0 r0 = r0.copy(r1, r2, r3, r4)
            return r0
    }

    public final java.lang.String component1() {
            r1 = this;
            java.lang.String r0 = r1.schemaName
            return r0
    }

    public final java.util.List<java.lang.Object> component2() {
            r1 = this;
            java.util.List<java.lang.Object> r0 = r1.format
            return r0
    }

    public final java.lang.String component3() {
            r1 = this;
            java.lang.String r0 = r1.createdAtBlock
            return r0
    }

    public final java.lang.String component4() {
            r1 = this;
            java.lang.String r0 = r1.createdAtTime
            return r0
    }

    public final p255od.C5214l0 copy(java.lang.String r2, java.util.List<java.lang.Object> r3, java.lang.String r4, java.lang.String r5) {
            r1 = this;
            java.lang.String r0 = "schemaName"
            p214m2.C4339q.m9706k(r2, r0)
            java.lang.String r0 = "format"
            p214m2.C4339q.m9706k(r3, r0)
            java.lang.String r0 = "createdAtBlock"
            p214m2.C4339q.m9706k(r4, r0)
            java.lang.String r0 = "createdAtTime"
            p214m2.C4339q.m9706k(r5, r0)
            od.l0 r0 = new od.l0
            r0.<init>(r2, r3, r4, r5)
            return r0
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof p255od.C5214l0
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            od.l0 r5 = (p255od.C5214l0) r5
            java.lang.String r1 = r4.schemaName
            java.lang.String r3 = r5.schemaName
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.util.List<java.lang.Object> r1 = r4.format
            java.util.List<java.lang.Object> r3 = r5.format
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            java.lang.String r1 = r4.createdAtBlock
            java.lang.String r3 = r5.createdAtBlock
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L2d
            return r2
        L2d:
            java.lang.String r1 = r4.createdAtTime
            java.lang.String r5 = r5.createdAtTime
            boolean r5 = p214m2.C4339q.m9702c(r1, r5)
            if (r5 != 0) goto L38
            return r2
        L38:
            return r0
    }

    public final java.lang.String getCreatedAtBlock() {
            r1 = this;
            java.lang.String r0 = r1.createdAtBlock
            return r0
    }

    public final java.lang.String getCreatedAtTime() {
            r1 = this;
            java.lang.String r0 = r1.createdAtTime
            return r0
    }

    public final java.util.List<java.lang.Object> getFormat() {
            r1 = this;
            java.util.List<java.lang.Object> r0 = r1.format
            return r0
    }

    public final java.lang.String getSchemaName() {
            r1 = this;
            java.lang.String r0 = r1.schemaName
            return r0
    }

    public int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.schemaName
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.util.List<java.lang.Object> r1 = r3.format
            r2 = 31
            int r0 = p255od.C5212k0.m11509a(r1, r0, r2)
            java.lang.String r1 = r3.createdAtBlock
            int r0 = p213m1.C4319e.m9651a(r1, r0, r2)
            java.lang.String r1 = r3.createdAtTime
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = "Schema(schemaName="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.lang.String r1 = r3.schemaName
            r0.append(r1)
            java.lang.String r1 = ", format="
            r0.append(r1)
            java.util.List<java.lang.Object> r1 = r3.format
            r0.append(r1)
            java.lang.String r1 = ", createdAtBlock="
            r0.append(r1)
            java.lang.String r1 = r3.createdAtBlock
            r0.append(r1)
            java.lang.String r1 = ", createdAtTime="
            r0.append(r1)
            java.lang.String r1 = r3.createdAtTime
            r2 = 41
            java.lang.String r0 = p185k7.C3814g5.m8552a(r0, r1, r2)
            return r0
    }
}
