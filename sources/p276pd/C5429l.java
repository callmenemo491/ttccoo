package p276pd;

/* renamed from: pd.l */
/* loaded from: classes.dex */
public final class C5429l implements p276pd.InterfaceC5460t1 {
    private final java.lang.String memo;
    private final java.lang.String recipient;
    private final java.util.List<java.lang.String> recipient_asset_ids;
    private final java.lang.String sender;
    private final java.util.List<java.lang.String> sender_asset_ids;

    public C5429l(java.lang.String r2, java.lang.String r3, java.util.List<java.lang.String> r4, java.util.List<java.lang.String> r5, java.lang.String r6) {
            r1 = this;
            java.lang.String r0 = "sender"
            p214m2.C4339q.m9706k(r2, r0)
            java.lang.String r0 = "recipient"
            p214m2.C4339q.m9706k(r3, r0)
            java.lang.String r0 = "sender_asset_ids"
            p214m2.C4339q.m9706k(r4, r0)
            java.lang.String r0 = "recipient_asset_ids"
            p214m2.C4339q.m9706k(r5, r0)
            java.lang.String r0 = "memo"
            p214m2.C4339q.m9706k(r6, r0)
            r1.<init>()
            r1.sender = r2
            r1.recipient = r3
            r1.sender_asset_ids = r4
            r1.recipient_asset_ids = r5
            r1.memo = r6
            return
    }

    public static /* synthetic */ p276pd.C5429l copy$default(p276pd.C5429l r3, java.lang.String r4, java.lang.String r5, java.util.List r6, java.util.List r7, java.lang.String r8, int r9, java.lang.Object r10) {
            r10 = r9 & 1
            if (r10 == 0) goto L6
            java.lang.String r4 = r3.sender
        L6:
            r10 = r9 & 2
            if (r10 == 0) goto Lc
            java.lang.String r5 = r3.recipient
        Lc:
            r10 = r5
            r5 = r9 & 4
            if (r5 == 0) goto L13
            java.util.List<java.lang.String> r6 = r3.sender_asset_ids
        L13:
            r0 = r6
            r5 = r9 & 8
            if (r5 == 0) goto L1a
            java.util.List<java.lang.String> r7 = r3.recipient_asset_ids
        L1a:
            r1 = r7
            r5 = r9 & 16
            if (r5 == 0) goto L21
            java.lang.String r8 = r3.memo
        L21:
            r2 = r8
            r5 = r3
            r6 = r4
            r7 = r10
            r8 = r0
            r9 = r1
            r10 = r2
            pd.l r3 = r5.copy(r6, r7, r8, r9, r10)
            return r3
    }

    public final java.lang.String component1() {
            r1 = this;
            java.lang.String r0 = r1.sender
            return r0
    }

    public final java.lang.String component2() {
            r1 = this;
            java.lang.String r0 = r1.recipient
            return r0
    }

    public final java.util.List<java.lang.String> component3() {
            r1 = this;
            java.util.List<java.lang.String> r0 = r1.sender_asset_ids
            return r0
    }

    public final java.util.List<java.lang.String> component4() {
            r1 = this;
            java.util.List<java.lang.String> r0 = r1.recipient_asset_ids
            return r0
    }

    public final java.lang.String component5() {
            r1 = this;
            java.lang.String r0 = r1.memo
            return r0
    }

    public final p276pd.C5429l copy(java.lang.String r8, java.lang.String r9, java.util.List<java.lang.String> r10, java.util.List<java.lang.String> r11, java.lang.String r12) {
            r7 = this;
            java.lang.String r0 = "sender"
            p214m2.C4339q.m9706k(r8, r0)
            java.lang.String r0 = "recipient"
            p214m2.C4339q.m9706k(r9, r0)
            java.lang.String r0 = "sender_asset_ids"
            p214m2.C4339q.m9706k(r10, r0)
            java.lang.String r0 = "recipient_asset_ids"
            p214m2.C4339q.m9706k(r11, r0)
            java.lang.String r0 = "memo"
            p214m2.C4339q.m9706k(r12, r0)
            pd.l r0 = new pd.l
            r1 = r0
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            r1.<init>(r2, r3, r4, r5, r6)
            return r0
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof p276pd.C5429l
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            pd.l r5 = (p276pd.C5429l) r5
            java.lang.String r1 = r4.sender
            java.lang.String r3 = r5.sender
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.String r1 = r4.recipient
            java.lang.String r3 = r5.recipient
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            java.util.List<java.lang.String> r1 = r4.sender_asset_ids
            java.util.List<java.lang.String> r3 = r5.sender_asset_ids
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L2d
            return r2
        L2d:
            java.util.List<java.lang.String> r1 = r4.recipient_asset_ids
            java.util.List<java.lang.String> r3 = r5.recipient_asset_ids
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L38
            return r2
        L38:
            java.lang.String r1 = r4.memo
            java.lang.String r5 = r5.memo
            boolean r5 = p214m2.C4339q.m9702c(r1, r5)
            if (r5 != 0) goto L43
            return r2
        L43:
            return r0
    }

    public final java.lang.String getGetMemo() {
            r1 = this;
            java.lang.String r0 = r1.memo
            return r0
    }

    public final java.lang.String getGetRecipient() {
            r1 = this;
            java.lang.String r0 = r1.recipient
            return r0
    }

    public final byte[] getGetRecipientAssetIds() {
            r1 = this;
            java.util.List<java.lang.String> r0 = r1.recipient_asset_ids
            byte[] r0 = p185k7.C4038x4.m9093f(r0)
            return r0
    }

    public final java.lang.String getGetSender() {
            r1 = this;
            java.lang.String r0 = r1.sender
            return r0
    }

    public final byte[] getGetSenderAssetIds() {
            r1 = this;
            java.util.List<java.lang.String> r0 = r1.sender_asset_ids
            byte[] r0 = p185k7.C4038x4.m9093f(r0)
            return r0
    }

    @Override // p276pd.InterfaceC5460t1
    public java.lang.String getHex() {
            r2 = this;
            pd.a r0 = new pd.a
            dd.b r1 = p059dd.EnumC1428b.f7113Y
            r0.<init>(r1)
            pd.a r0 = r0.squishAtomicCreateOfferArgs(r2)
            java.lang.String r0 = r0.toHex()
            java.lang.String r1 = "AbiBinaryGenTransactions\u2026   this\n        ).toHex()"
            p214m2.C4339q.m9705j(r0, r1)
            return r0
    }

    @Override // p276pd.InterfaceC5460t1
    public java.lang.String getJson() {
            r1 = this;
            java.lang.String r0 = p276pd.InterfaceC5460t1.a.getJson(r1)
            return r0
    }

    public final java.lang.String getMemo() {
            r1 = this;
            java.lang.String r0 = r1.memo
            return r0
    }

    public final java.lang.String getRecipient() {
            r1 = this;
            java.lang.String r0 = r1.recipient
            return r0
    }

    public final java.util.List<java.lang.String> getRecipient_asset_ids() {
            r1 = this;
            java.util.List<java.lang.String> r0 = r1.recipient_asset_ids
            return r0
    }

    public final java.lang.String getSender() {
            r1 = this;
            java.lang.String r0 = r1.sender
            return r0
    }

    public final java.util.List<java.lang.String> getSender_asset_ids() {
            r1 = this;
            java.util.List<java.lang.String> r0 = r1.sender_asset_ids
            return r0
    }

    public int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.sender
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.lang.String r1 = r3.recipient
            r2 = 31
            int r0 = p213m1.C4319e.m9651a(r1, r0, r2)
            java.util.List<java.lang.String> r1 = r3.sender_asset_ids
            int r0 = p255od.C5212k0.m11509a(r1, r0, r2)
            java.util.List<java.lang.String> r1 = r3.recipient_asset_ids
            int r0 = p255od.C5212k0.m11509a(r1, r0, r2)
            java.lang.String r1 = r3.memo
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = "AtomicCreateOfferArgs(sender="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.lang.String r1 = r3.sender
            r0.append(r1)
            java.lang.String r1 = ", recipient="
            r0.append(r1)
            java.lang.String r1 = r3.recipient
            r0.append(r1)
            java.lang.String r1 = ", sender_asset_ids="
            r0.append(r1)
            java.util.List<java.lang.String> r1 = r3.sender_asset_ids
            r0.append(r1)
            java.lang.String r1 = ", recipient_asset_ids="
            r0.append(r1)
            java.util.List<java.lang.String> r1 = r3.recipient_asset_ids
            r0.append(r1)
            java.lang.String r1 = ", memo="
            r0.append(r1)
            java.lang.String r1 = r3.memo
            r2 = 41
            java.lang.String r0 = p185k7.C3814g5.m8552a(r0, r1, r2)
            return r0
    }
}
