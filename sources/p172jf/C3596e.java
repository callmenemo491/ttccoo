package p172jf;

/* renamed from: jf.e */
/* loaded from: classes.dex */
public final class C3596e extends p239nh.AbstractC4830j implements mh.InterfaceC4609a<ch.C0985l> {

    /* renamed from: Z */
    public final /* synthetic */ p172jf.C3593b f15766Z;

    public C3596e(p172jf.C3593b r1) {
            r0 = this;
            r0.f15766Z = r1
            r1 = 0
            r0.<init>(r1)
            return
    }

    @Override // mh.InterfaceC4609a
    /* renamed from: e */
    public ch.C0985l mo15e() {
            r18 = this;
            r0 = r18
            jf.b r1 = r0.f15766Z
            int r2 = p172jf.C3593b.f15733q1
            jf.g r1 = r1.m8019Q0()
            jf.b r2 = r0.f15766Z
            android.content.Context r2 = r2.m1334s0()
            java.util.Objects.requireNonNull(r1)
            java.lang.String r3 = "context"
            p214m2.C4339q.m9706k(r2, r3)
            java.lang.String r4 = "UTC"
            java.util.TimeZone r4 = java.util.TimeZone.getTimeZone(r4)
            java.util.Calendar r4 = java.util.Calendar.getInstance(r4)
            long r4 = r4.getTimeInMillis()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            androidx.lifecycle.d0<java.util.List<java.lang.Object>> r9 = r1.f15773h
            java.lang.Object r9 = r9.m1411d()
            java.util.List r9 = (java.util.List) r9
            if (r9 != 0) goto L41
            dh.k r9 = p062dh.C1475k.f7237Y
        L41:
            java.util.Iterator r9 = r9.iterator()
        L45:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto Ld6
            java.lang.Object r10 = r9.next()
            boolean r11 = r10 instanceof p192kf.C4119p
            if (r11 == 0) goto La4
            kf.p r10 = (p192kf.C4119p) r10
            java.util.List<kf.o> r11 = r10.f17129g
            java.util.Iterator r11 = r11.iterator()
        L5b:
            boolean r15 = r11.hasNext()
            if (r15 == 0) goto L9e
            java.lang.Object r15 = r11.next()
            kf.o r15 = (p192kf.C4118o) r15
            if (r15 == 0) goto L91
            long r12 = r15.f17121j
            int r14 = r15.f17120i
            r16 = r2
            r17 = r3
            long r2 = (long) r14
            long r12 = r12 + r2
            r3 = r1
            r2 = 1000(0x3e8, float:1.401E-42)
            long r0 = (long) r2
            long r12 = r12 * r0
            long r12 = r12 - r4
            double r0 = (double) r12
            r12 = 0
            int r2 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r2 > 0) goto L96
            boolean r0 = r10.f17131i
            if (r0 == 0) goto L8b
            java.lang.String r0 = r15.f17112a
            r6.add(r0)
            goto L96
        L8b:
            java.lang.String r0 = r15.f17112a
            r7.add(r0)
            goto L96
        L91:
            r16 = r2
            r17 = r3
            r3 = r1
        L96:
            r0 = r18
            r1 = r3
            r2 = r16
            r3 = r17
            goto L5b
        L9e:
            r16 = r2
            r17 = r3
            r3 = r1
            goto Lcd
        La4:
            r16 = r2
            r17 = r3
            r3 = r1
            boolean r0 = r10 instanceof p192kf.C4120q
            if (r0 == 0) goto Lcd
            kf.q r10 = (p192kf.C4120q) r10
            long r0 = r10.f17139h
            int r2 = r10.f17138g
            long r11 = (long) r2
            long r0 = r0 + r11
            r2 = 1000(0x3e8, float:1.401E-42)
            long r11 = (long) r2
            long r0 = r0 * r11
            long r0 = r0 - r4
            int r2 = r10.f17140i
            r11 = 3245(0xcad, float:4.547E-42)
            if (r2 == r11) goto Lcd
            double r0 = (double) r0
            r11 = 0
            int r2 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r2 > 0) goto Lcd
            java.lang.String r0 = r10.f17132a
            r8.add(r0)
        Lcd:
            r0 = r18
            r1 = r3
            r2 = r16
            r3 = r17
            goto L45
        Ld6:
            r16 = r2
            r17 = r3
            r3 = r1
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L10e
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto L10e
            boolean r0 = r8.isEmpty()
            if (r0 == 0) goto L10e
            androidx.lifecycle.d0<vg.b<ah.a>> r0 = r3.f15780o
            java.lang.String r1 = "Wait"
            zg.d r2 = p458zg.EnumC7332d.f28069a0
            java.lang.String r3 = "title"
            p214m2.C4339q.m9706k(r1, r3)
            java.lang.String r3 = "image"
            p214m2.C4339q.m9706k(r2, r3)
            vg.b r3 = new vg.b
            ah.a r4 = new ah.a
            java.lang.String r5 = "Nothing to harvest!"
            r4.<init>(r1, r5, r2)
            r3.<init>(r4)
            r0.mo7l(r3)
            goto L18f
        L10e:
            nd.b0 r0 = r3.f15768c
            jf.i r1 = new jf.i
            r1.<init>(r3)
            java.util.Objects.requireNonNull(r0)
            r2 = r16
            r3 = r17
            p214m2.C4339q.m9706k(r2, r3)
            java.lang.String r3 = "animals"
            p214m2.C4339q.m9706k(r6, r3)
            java.lang.String r3 = "plants"
            p214m2.C4339q.m9706k(r7, r3)
            java.lang.String r3 = "buildOuts"
            p214m2.C4339q.m9706k(r8, r3)
            java.lang.String r3 = "completion"
            p214m2.C4339q.m9706k(r1, r3)
            r0.f18918n = r1
            id.b r1 = r0.m10795h()
            if (r1 != 0) goto L13c
            goto L18f
        L13c:
            java.lang.String r3 = r1.f12559a
            int r4 = r3.length()
            r5 = 1
            if (r4 != 0) goto L147
            r4 = 1
            goto L148
        L147:
            r4 = 0
        L148:
            if (r4 != 0) goto L192
            boolean r4 = r6.isEmpty()
            if (r4 == 0) goto L165
            boolean r4 = r7.isEmpty()
            if (r4 == 0) goto L165
            boolean r4 = r8.isEmpty()
            if (r4 != 0) goto L15d
            goto L165
        L15d:
            java.security.InvalidParameterException r0 = new java.security.InvalidParameterException
            java.lang.String r1 = "Animas, plants and buildOuts are empty"
            r0.<init>(r1)
            throw r0
        L165:
            one.block.eosiojava.models.rpcProvider.Authorization r4 = new one.block.eosiojava.models.rpcProvider.Authorization
            java.lang.String r9 = r0.f18911g
            r4.<init>(r3, r9)
            b3.b r9 = new b3.b
            r9.<init>(r5)
            nd.w0 r5 = new nd.w0
            pd.z0 r10 = new pd.z0
            r10.<init>(r3, r6, r7, r8)
            java.util.List r3 = p074e9.C1805a.m4528m(r4)
            java.lang.String r6 = "farminggames"
            java.lang.String r7 = "harvestmulti2"
            r5.<init>(r6, r7, r10, r3)
            r9.m2208c(r5)
            nd.a r3 = p238nd.EnumC4724a.f18892v0
            r9.m2209d(r3, r4)
            r3 = 0
            r0.m10804r(r2, r1, r9, r3)
        L18f:
            ch.l r0 = ch.C0985l.f5061a
            return r0
        L192:
            java.lang.Exception r0 = new java.lang.Exception
            java.lang.String r1 = "USER_NOT_SIGNED"
            r0.<init>(r1)
            throw r0
    }
}
