package je;

/* renamed from: je.h */
/* loaded from: classes.dex */
public final class C3586h extends p239nh.AbstractC4830j implements mh.InterfaceC4624p<p086f2.InterfaceC1987b<? extends je.C3590l>, java.lang.Integer, ch.C0985l> {

    /* renamed from: Z */
    public final /* synthetic */ je.C3583e f15715Z;

    public C3586h(je.C3583e r1) {
            r0 = this;
            r0.f15715Z = r1
            r1 = 2
            r0.<init>(r1)
            return
    }

    @Override // mh.InterfaceC4624p
    /* renamed from: l */
    public ch.C0985l mo122l(p086f2.InterfaceC1987b<? extends je.C3590l> r11, java.lang.Integer r12) {
            r10 = this;
            f2.b r11 = (p086f2.InterfaceC1987b) r11
            java.lang.Number r12 = (java.lang.Number) r12
            r12.intValue()
            java.lang.String r12 = "$this$onClickAvoidReclick"
            p214m2.C4339q.m9706k(r11, r12)
            je.e r12 = r10.f15715Z
            int r0 = je.C3583e.f15701o1
            je.j r12 = r12.m8016O0()
            java.lang.Object r11 = r11.getItem()
            r2 = r11
            je.l r2 = (je.C3590l) r2
            java.util.Objects.requireNonNull(r12)
            java.lang.String r11 = "tradeElement"
            p214m2.C4339q.m9706k(r2, r11)
            nd.b0 r11 = r12.f15717c
            androidx.lifecycle.LiveData<java.util.List<od.z>> r11 = r11.f18929y
            java.lang.Object r11 = r11.m1411d()
            java.util.List r11 = (java.util.List) r11
            if (r11 != 0) goto L31
            dh.k r11 = p062dh.C1475k.f7237Y
        L31:
            java.util.Iterator r11 = r11.iterator()
        L35:
            boolean r0 = r11.hasNext()
            r1 = 0
            if (r0 == 0) goto Ld9
            java.lang.Object r0 = r11.next()
            r3 = r0
            od.z r3 = (p255od.C5238z) r3
            od.s r4 = r3.getBase_token()
            od.o0 r4 = r4.getSymbol()
            java.lang.String r4 = r4.getName()
            java.lang.String r5 = r2.f15725Y
            boolean r4 = p214m2.C4339q.m9702c(r4, r5)
            if (r4 == 0) goto L8b
            od.s r4 = r3.getBase_token()
            java.lang.String r4 = r4.getContract()
            java.lang.String r5 = r2.f15727a0
            boolean r4 = p214m2.C4339q.m9702c(r4, r5)
            if (r4 == 0) goto L8b
            od.s r4 = r3.getQuote_token()
            od.o0 r4 = r4.getSymbol()
            java.lang.String r4 = r4.getName()
            java.lang.String r5 = r2.f15726Z
            boolean r4 = p214m2.C4339q.m9702c(r4, r5)
            if (r4 == 0) goto L8b
            od.s r4 = r3.getQuote_token()
            java.lang.String r4 = r4.getContract()
            java.lang.String r5 = r2.f15728b0
            boolean r4 = p214m2.C4339q.m9702c(r4, r5)
            if (r4 != 0) goto Ld3
        L8b:
            od.s r4 = r3.getBase_token()
            od.o0 r4 = r4.getSymbol()
            java.lang.String r4 = r4.getName()
            java.lang.String r5 = r2.f15726Z
            boolean r4 = p214m2.C4339q.m9702c(r4, r5)
            if (r4 == 0) goto Ld5
            od.s r4 = r3.getBase_token()
            java.lang.String r4 = r4.getContract()
            java.lang.String r5 = r2.f15728b0
            boolean r4 = p214m2.C4339q.m9702c(r4, r5)
            if (r4 == 0) goto Ld5
            od.s r4 = r3.getQuote_token()
            od.o0 r4 = r4.getSymbol()
            java.lang.String r4 = r4.getName()
            java.lang.String r5 = r2.f15725Y
            boolean r4 = p214m2.C4339q.m9702c(r4, r5)
            if (r4 == 0) goto Ld5
            od.s r3 = r3.getQuote_token()
            java.lang.String r3 = r3.getContract()
            java.lang.String r4 = r2.f15727a0
            boolean r3 = p214m2.C4339q.m9702c(r3, r4)
            if (r3 == 0) goto Ld5
        Ld3:
            r3 = 1
            goto Ld6
        Ld5:
            r3 = 0
        Ld6:
            if (r3 == 0) goto L35
            goto Lda
        Ld9:
            r0 = r1
        Lda:
            od.z r0 = (p255od.C5238z) r0
            if (r0 != 0) goto Ldf
            goto L13d
        Ldf:
            od.s r11 = r0.getBase_token()
            od.o0 r11 = r11.getSymbol()
            java.lang.String r11 = r11.getName()
            java.lang.String r3 = r2.f15725Y
            boolean r11 = p214m2.C4339q.m9702c(r11, r3)
            if (r11 == 0) goto L114
            od.s r11 = r0.getBase_token()
            java.lang.String r11 = r11.getContract()
            java.lang.String r3 = r2.f15727a0
            boolean r11 = p214m2.C4339q.m9702c(r11, r3)
            if (r11 == 0) goto L114
            je.a r11 = r0.toBaseMarketConversion()
            je.a r3 = r0.toQuoteMarketConversion()
            double r4 = r0.getBase_token_quantity()
            double r6 = r0.getQuote_token_quantity()
            goto L124
        L114:
            je.a r11 = r0.toQuoteMarketConversion()
            je.a r3 = r0.toBaseMarketConversion()
            double r4 = r0.getQuote_token_quantity()
            double r6 = r0.getBase_token_quantity()
        L124:
            r7 = r6
            r5 = r4
            r4 = r3
            r3 = r11
            ke.a r11 = new ke.a
            od.b0 r9 = r12.f15723i
            if (r9 == 0) goto L140
            r0 = r11
            r1 = r9
            r0.<init>(r1, r2, r3, r4, r5, r7)
            androidx.lifecycle.d0<vg.b<ke.a>> r12 = r12.f15721g
            vg.b r0 = new vg.b
            r0.<init>(r11)
            r12.mo7l(r0)
        L13d:
            ch.l r11 = ch.C0985l.f5061a
            return r11
        L140:
            java.lang.String r11 = "balance"
            p214m2.C4339q.m9713w(r11)
            throw r1
    }
}
