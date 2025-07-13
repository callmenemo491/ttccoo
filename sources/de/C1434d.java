package de;

/* renamed from: de.d */
/* loaded from: classes.dex */
public final class C1434d extends p239nh.AbstractC4830j implements mh.InterfaceC4609a<ch.C0985l> {

    /* renamed from: Z */
    public final /* synthetic */ io.tacocrypto.app.p156ui.secret.SecretFragment f7119Z;

    /* renamed from: a0 */
    public final /* synthetic */ de.C1444n f7120a0;

    public C1434d(io.tacocrypto.app.p156ui.secret.SecretFragment r1, de.C1444n r2) {
            r0 = this;
            r0.f7119Z = r1
            r0.f7120a0 = r2
            r1 = 0
            r0.<init>(r1)
            return
    }

    @Override // mh.InterfaceC4609a
    /* renamed from: e */
    public ch.C0985l mo15e() {
            r13 = this;
            io.tacocrypto.app.ui.secret.SecretFragment r0 = r13.f7119Z
            int r1 = io.tacocrypto.app.p156ui.secret.SecretFragment.f14309X0
            de.l r0 = r0.m7730H0()
            io.tacocrypto.app.ui.secret.SecretFragment r1 = r13.f7119Z
            android.content.Context r3 = r1.m1334s0()
            de.n r1 = r13.f7120a0
            java.util.Objects.requireNonNull(r0)
            java.lang.String r2 = "context"
            p214m2.C4339q.m9706k(r3, r2)
            java.lang.String r4 = "item"
            p214m2.C4339q.m9706k(r1, r4)
            nd.b0 r4 = r0.f7134c
            id.b r4 = r4.m10795h()
            if (r4 != 0) goto L26
            goto L6e
        L26:
            md.t0 r4 = r1.f7165c
            p214m2.C4339q.m9704i(r4)
            nd.b0 r5 = r0.f7134c
            de.k r6 = new de.k
            r6.<init>(r0, r1)
            java.util.Objects.requireNonNull(r5)
            p214m2.C4339q.m9706k(r3, r2)
            java.lang.String r0 = "secretTool"
            p214m2.C4339q.m9706k(r4, r0)
            java.lang.String r0 = "completion"
            p214m2.C4339q.m9706k(r6, r0)
            od.r r0 = new od.r
            double r1 = r4.getCost()
            r7 = 4
            r8 = 0
            r9 = 2
            java.lang.String r9 = vg.C6672m.m13535v(r1, r7, r8, r9)
            long r1 = r4.getTemplate_id()
            java.lang.String r11 = java.lang.String.valueOf(r1)
            java.lang.String r8 = "s.taco"
            java.lang.String r10 = "TACO"
            java.lang.String r12 = "t.taco"
            r7 = r0
            r7.<init>(r8, r9, r10, r11, r12)
            java.util.List r4 = p074e9.C1805a.m4528m(r0)
            r0 = 0
            r7 = 0
            r8 = 16
            r2 = r5
            r5 = r0
            p238nd.C4728b0.m10790o(r2, r3, r4, r5, r6, r7, r8)
        L6e:
            ch.l r0 = ch.C0985l.f5061a
            return r0
    }
}
