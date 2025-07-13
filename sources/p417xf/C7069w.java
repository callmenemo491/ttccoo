package p417xf;

/* renamed from: xf.w */
/* loaded from: classes.dex */
public final class C7069w {
    private final java.lang.String created_at_time;
    private final java.lang.String memo;
    private final java.lang.String recipient_name;
    private final java.lang.String sender_name;

    public C7069w(java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String r4) {
            r0 = this;
            r0.<init>()
            r0.recipient_name = r1
            r0.sender_name = r2
            r0.memo = r3
            r0.created_at_time = r4
            return
    }

    public static /* synthetic */ p417xf.C7069w copy$default(p417xf.C7069w r0, java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, int r5, java.lang.Object r6) {
            r6 = r5 & 1
            if (r6 == 0) goto L6
            java.lang.String r1 = r0.recipient_name
        L6:
            r6 = r5 & 2
            if (r6 == 0) goto Lc
            java.lang.String r2 = r0.sender_name
        Lc:
            r6 = r5 & 4
            if (r6 == 0) goto L12
            java.lang.String r3 = r0.memo
        L12:
            r5 = r5 & 8
            if (r5 == 0) goto L18
            java.lang.String r4 = r0.created_at_time
        L18:
            xf.w r0 = r0.copy(r1, r2, r3, r4)
            return r0
    }

    public final java.lang.String component1() {
            r1 = this;
            java.lang.String r0 = r1.recipient_name
            return r0
    }

    public final java.lang.String component2() {
            r1 = this;
            java.lang.String r0 = r1.sender_name
            return r0
    }

    public final java.lang.String component3() {
            r1 = this;
            java.lang.String r0 = r1.memo
            return r0
    }

    public final java.lang.String component4() {
            r1 = this;
            java.lang.String r0 = r1.created_at_time
            return r0
    }

    public final p417xf.C7069w copy(java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5) {
            r1 = this;
            xf.w r0 = new xf.w
            r0.<init>(r2, r3, r4, r5)
            return r0
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof p417xf.C7069w
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            xf.w r5 = (p417xf.C7069w) r5
            java.lang.String r1 = r4.recipient_name
            java.lang.String r3 = r5.recipient_name
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.String r1 = r4.sender_name
            java.lang.String r3 = r5.sender_name
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            java.lang.String r1 = r4.memo
            java.lang.String r3 = r5.memo
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L2d
            return r2
        L2d:
            java.lang.String r1 = r4.created_at_time
            java.lang.String r5 = r5.created_at_time
            boolean r5 = p214m2.C4339q.m9702c(r1, r5)
            if (r5 != 0) goto L38
            return r2
        L38:
            return r0
    }

    public final java.lang.String getCreated_at_time() {
            r1 = this;
            java.lang.String r0 = r1.created_at_time
            return r0
    }

    public final java.lang.String getMemo() {
            r1 = this;
            java.lang.String r0 = r1.memo
            return r0
    }

    public final java.lang.String getRecipient_name() {
            r1 = this;
            java.lang.String r0 = r1.recipient_name
            return r0
    }

    public final java.lang.String getSender_name() {
            r1 = this;
            java.lang.String r0 = r1.sender_name
            return r0
    }

    public int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.recipient_name
            r1 = 0
            if (r0 != 0) goto L7
            r0 = 0
            goto Lb
        L7:
            int r0 = r0.hashCode()
        Lb:
            int r0 = r0 * 31
            java.lang.String r2 = r3.sender_name
            if (r2 != 0) goto L13
            r2 = 0
            goto L17
        L13:
            int r2 = r2.hashCode()
        L17:
            int r0 = r0 + r2
            int r0 = r0 * 31
            java.lang.String r2 = r3.memo
            if (r2 != 0) goto L20
            r2 = 0
            goto L24
        L20:
            int r2 = r2.hashCode()
        L24:
            int r0 = r0 + r2
            int r0 = r0 * 31
            java.lang.String r2 = r3.created_at_time
            if (r2 != 0) goto L2c
            goto L30
        L2c:
            int r1 = r2.hashCode()
        L30:
            int r0 = r0 + r1
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = "TransferAsset(recipient_name="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.lang.String r1 = r3.recipient_name
            r0.append(r1)
            java.lang.String r1 = ", sender_name="
            r0.append(r1)
            java.lang.String r1 = r3.sender_name
            r0.append(r1)
            java.lang.String r1 = ", memo="
            r0.append(r1)
            java.lang.String r1 = r3.memo
            r0.append(r1)
            java.lang.String r1 = ", created_at_time="
            r0.append(r1)
            java.lang.String r1 = r3.created_at_time
            r2 = 41
            java.lang.String r0 = p185k7.C3814g5.m8552a(r0, r1, r2)
            return r0
    }
}
