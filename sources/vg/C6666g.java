package vg;

/* renamed from: vg.g */
/* loaded from: classes.dex */
public final /* synthetic */ class C6666g implements androidx.lifecycle.InterfaceC0439e0 {

    /* renamed from: a */
    public final /* synthetic */ int f25912a;

    /* renamed from: b */
    public final /* synthetic */ androidx.lifecycle.C0433b0 f25913b;

    /* renamed from: c */
    public final /* synthetic */ mh.InterfaceC4624p f25914c;

    /* renamed from: d */
    public final /* synthetic */ androidx.lifecycle.LiveData f25915d;

    /* renamed from: e */
    public final /* synthetic */ androidx.lifecycle.LiveData f25916e;

    public /* synthetic */ C6666g(androidx.lifecycle.C0433b0 r2, mh.InterfaceC4624p r3, androidx.lifecycle.LiveData r4, androidx.lifecycle.LiveData r5, int r6) {
            r1 = this;
            r1.f25912a = r6
            r0 = 1
            if (r6 == r0) goto L6
            r0 = 2
        L6:
            r1.<init>()
            r1.f25913b = r2
            r1.f25914c = r3
            r1.f25915d = r4
            r1.f25916e = r5
            return
    }

    @Override // androidx.lifecycle.InterfaceC0439e0
    /* renamed from: d */
    public final void mo124d(java.lang.Object r8) {
            r7 = this;
            int r8 = r7.f25912a
            java.lang.String r0 = "$liveData2"
            java.lang.String r1 = "$liveData1"
            java.lang.String r2 = "$liveData"
            java.lang.String r3 = "$this_combineWith"
            java.lang.String r4 = "$block"
            java.lang.String r5 = "$result"
            switch(r8) {
                case 0: goto L5a;
                case 1: goto L36;
                case 2: goto L12;
                default: goto L11;
            }
        L11:
            goto L7e
        L12:
            androidx.lifecycle.b0 r8 = r7.f25913b
            mh.p r2 = r7.f25914c
            androidx.lifecycle.LiveData r3 = r7.f25915d
            androidx.lifecycle.LiveData r6 = r7.f25916e
            p214m2.C4339q.m9706k(r8, r5)
            p214m2.C4339q.m9706k(r2, r4)
            p214m2.C4339q.m9706k(r3, r1)
            p214m2.C4339q.m9706k(r6, r0)
            java.lang.Object r0 = r3.m1411d()
            java.lang.Object r1 = r6.m1411d()
            java.lang.Object r0 = r2.mo122l(r0, r1)
            r8.mo7l(r0)
            return
        L36:
            androidx.lifecycle.b0 r8 = r7.f25913b
            mh.p r0 = r7.f25914c
            androidx.lifecycle.LiveData r1 = r7.f25915d
            androidx.lifecycle.LiveData r6 = r7.f25916e
            p214m2.C4339q.m9706k(r8, r5)
            p214m2.C4339q.m9706k(r0, r4)
            p214m2.C4339q.m9706k(r1, r3)
            p214m2.C4339q.m9706k(r6, r2)
            java.lang.Object r1 = r1.m1411d()
            java.lang.Object r2 = r6.m1411d()
            java.lang.Object r0 = r0.mo122l(r1, r2)
            r8.mo7l(r0)
            return
        L5a:
            androidx.lifecycle.b0 r8 = r7.f25913b
            mh.p r0 = r7.f25914c
            androidx.lifecycle.LiveData r1 = r7.f25915d
            androidx.lifecycle.LiveData r6 = r7.f25916e
            p214m2.C4339q.m9706k(r8, r5)
            p214m2.C4339q.m9706k(r0, r4)
            p214m2.C4339q.m9706k(r1, r3)
            p214m2.C4339q.m9706k(r6, r2)
            java.lang.Object r1 = r1.m1411d()
            java.lang.Object r2 = r6.m1411d()
            java.lang.Object r0 = r0.mo122l(r1, r2)
            r8.mo7l(r0)
            return
        L7e:
            androidx.lifecycle.b0 r8 = r7.f25913b
            mh.p r2 = r7.f25914c
            androidx.lifecycle.LiveData r3 = r7.f25915d
            androidx.lifecycle.LiveData r6 = r7.f25916e
            p214m2.C4339q.m9706k(r8, r5)
            p214m2.C4339q.m9706k(r2, r4)
            p214m2.C4339q.m9706k(r3, r1)
            p214m2.C4339q.m9706k(r6, r0)
            java.lang.Object r0 = r3.m1411d()
            java.lang.Object r1 = r6.m1411d()
            java.lang.Object r0 = r2.mo122l(r0, r1)
            r8.mo7l(r0)
            return
    }
}
