package mg;

/* renamed from: mg.e */
/* loaded from: classes.dex */
public final class C4607e {

    @p189kb.InterfaceC4079b("account_action_seq")
    private final long accountActionSeq;

    @p189kb.InterfaceC4079b("action_trace")
    private final mg.C4604b actionTrace;

    @p189kb.InterfaceC4079b("block_time")
    private final java.lang.String blockTime;

    @p189kb.InterfaceC4079b("irreversible")
    private final boolean irreversible;

    public C4607e(long r2, mg.C4604b r4, java.lang.String r5, boolean r6) {
            r1 = this;
            java.lang.String r0 = "actionTrace"
            p214m2.C4339q.m9706k(r4, r0)
            java.lang.String r0 = "blockTime"
            p214m2.C4339q.m9706k(r5, r0)
            r1.<init>()
            r1.accountActionSeq = r2
            r1.actionTrace = r4
            r1.blockTime = r5
            r1.irreversible = r6
            return
    }

    public static /* synthetic */ mg.C4607e copy$default(mg.C4607e r6, long r7, mg.C4604b r9, java.lang.String r10, boolean r11, int r12, java.lang.Object r13) {
            r13 = r12 & 1
            if (r13 == 0) goto L6
            long r7 = r6.accountActionSeq
        L6:
            r1 = r7
            r7 = r12 & 2
            if (r7 == 0) goto Ld
            mg.b r9 = r6.actionTrace
        Ld:
            r3 = r9
            r7 = r12 & 4
            if (r7 == 0) goto L14
            java.lang.String r10 = r6.blockTime
        L14:
            r4 = r10
            r7 = r12 & 8
            if (r7 == 0) goto L1b
            boolean r11 = r6.irreversible
        L1b:
            r5 = r11
            r0 = r6
            mg.e r6 = r0.copy(r1, r3, r4, r5)
            return r6
    }

    public final long component1() {
            r2 = this;
            long r0 = r2.accountActionSeq
            return r0
    }

    public final mg.C4604b component2() {
            r1 = this;
            mg.b r0 = r1.actionTrace
            return r0
    }

    public final java.lang.String component3() {
            r1 = this;
            java.lang.String r0 = r1.blockTime
            return r0
    }

    public final boolean component4() {
            r1 = this;
            boolean r0 = r1.irreversible
            return r0
    }

    public final mg.C4607e copy(long r8, mg.C4604b r10, java.lang.String r11, boolean r12) {
            r7 = this;
            java.lang.String r0 = "actionTrace"
            p214m2.C4339q.m9706k(r10, r0)
            java.lang.String r0 = "blockTime"
            p214m2.C4339q.m9706k(r11, r0)
            mg.e r0 = new mg.e
            r1 = r0
            r2 = r8
            r4 = r10
            r5 = r11
            r6 = r12
            r1.<init>(r2, r4, r5, r6)
            return r0
    }

    public boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 1
            if (r3 != r4) goto L4
            return r0
        L4:
            java.lang.Class<mg.e> r1 = mg.C4607e.class
            if (r4 == 0) goto Ld
            java.lang.Class r2 = r4.getClass()
            goto Le
        Ld:
            r2 = 0
        Le:
            boolean r1 = p214m2.C4339q.m9702c(r1, r2)
            r2 = 0
            if (r1 != 0) goto L16
            return r2
        L16:
            java.lang.String r1 = "null cannot be cast to non-null type io.tacocrypto.app.ui.tools.transactions.model.BloksTransaction"
            java.util.Objects.requireNonNull(r4, r1)
            mg.e r4 = (mg.C4607e) r4
            mg.b r1 = r3.actionTrace
            mg.b r4 = r4.actionTrace
            boolean r4 = p214m2.C4339q.m9702c(r1, r4)
            if (r4 != 0) goto L28
            return r2
        L28:
            return r0
    }

    public final long getAccountActionSeq() {
            r2 = this;
            long r0 = r2.accountActionSeq
            return r0
    }

    public final mg.C4604b getActionTrace() {
            r1 = this;
            mg.b r0 = r1.actionTrace
            return r0
    }

    public final java.lang.String getBlockTime() {
            r1 = this;
            java.lang.String r0 = r1.blockTime
            return r0
    }

    public final boolean getIrreversible() {
            r1 = this;
            boolean r0 = r1.irreversible
            return r0
    }

    public final ng.EnumC4820b getTransactionType(java.lang.String r4) {
            r3 = this;
            ng.b r0 = ng.EnumC4820b.f19211c0
            java.lang.String r1 = "username"
            p214m2.C4339q.m9706k(r4, r1)
            mg.b r1 = r3.actionTrace
            mg.a r1 = r1.getAct()
            java.lang.String r1 = r1.getAccount()
            java.lang.String r2 = "atomicassets"
            boolean r1 = p214m2.C4339q.m9702c(r1, r2)
            if (r1 == 0) goto L41
            mg.b r1 = r3.actionTrace
            mg.a r1 = r1.getAct()
            java.lang.String r1 = r1.getName()
            java.lang.String r2 = "transfer"
            boolean r1 = p214m2.C4339q.m9702c(r1, r2)
            if (r1 == 0) goto L62
            mg.b r0 = r3.actionTrace
            mg.a r0 = r0.getAct()
            java.lang.String r0 = r0.getFrom()
            boolean r4 = p214m2.C4339q.m9702c(r0, r4)
            if (r4 == 0) goto L3e
            ng.b r0 = ng.EnumC4820b.f19208Z
            goto L62
        L3e:
            ng.b r0 = ng.EnumC4820b.f19207Y
            goto L62
        L41:
            mg.b r1 = r3.actionTrace
            mg.a r1 = r1.getAct()
            java.lang.String r1 = r1.getQuantity()
            if (r1 == 0) goto L62
            mg.b r0 = r3.actionTrace
            mg.a r0 = r0.getAct()
            java.lang.String r0 = r0.getFrom()
            boolean r4 = p214m2.C4339q.m9702c(r0, r4)
            if (r4 == 0) goto L60
            ng.b r0 = ng.EnumC4820b.f19210b0
            goto L62
        L60:
            ng.b r0 = ng.EnumC4820b.f19209a0
        L62:
            return r0
    }

    public int hashCode() {
            r1 = this;
            mg.b r0 = r1.actionTrace
            int r0 = r0.hashCode()
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = "BloksTransaction(accountActionSeq="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            long r1 = r3.accountActionSeq
            r0.append(r1)
            java.lang.String r1 = ", actionTrace="
            r0.append(r1)
            mg.b r1 = r3.actionTrace
            r0.append(r1)
            java.lang.String r1 = ", blockTime="
            r0.append(r1)
            java.lang.String r1 = r3.blockTime
            r0.append(r1)
            java.lang.String r1 = ", irreversible="
            r0.append(r1)
            boolean r1 = r3.irreversible
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
