package p020b3;

/* renamed from: b3.b */
/* loaded from: classes.dex */
public final class C0660b {

    /* renamed from: a */
    public final java.util.List<com.bumptech.glide.load.ImageHeaderParser> f3814a;

    public C0660b(int r2) {
            r1 = this;
            r0 = 1
            if (r2 == r0) goto L1c
            r0 = 2
            if (r2 == r0) goto L11
            r1.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.f3814a = r2
            return
        L11:
            r1.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.f3814a = r2
            return
        L1c:
            r1.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.f3814a = r2
            return
    }

    /* renamed from: f */
    public static java.lang.String m2205f(p020b3.C0660b r7, android.content.Context r8, java.lang.String r9, boolean r10, int r11) {
            r0 = r11 & 2
            if (r0 == 0) goto L5
            r9 = 0
        L5:
            r11 = r11 & 4
            if (r11 == 0) goto La
            r10 = 1
        La:
            java.util.Objects.requireNonNull(r7)
            java.lang.String r11 = "context"
            p214m2.C4339q.m9706k(r8, r11)
            vc.a r11 = new vc.a
            java.lang.String r0 = "https://eos.greymass.com"
            r11.<init>(r0)
            uc.f r0 = new uc.f
            v.c r1 = new v.c
            r1.<init>(r8, r11)
            r0.<init>(r1)
            xc.f r8 = p414xc.EnumC7031f.WAX
            xc.g r8 = r8.toChainId()
            r0.f24851c = r8
            java.util.List<com.bumptech.glide.load.ImageHeaderParser> r7 = r7.f3814a
            java.util.ArrayList r8 = new java.util.ArrayList
            r11 = 10
            int r1 = p062dh.C1469e.m3992D(r7, r11)
            r8.<init>(r1)
            java.util.Iterator r7 = r7.iterator()
        L3c:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto Lb3
            java.lang.Object r1 = r7.next()
            nd.w0 r1 = (p238nd.C4783w0) r1
            xc.b r2 = new xc.b
            r2.<init>()
            xc.a r3 = new xc.a
            java.lang.String r4 = r1.f19148a
            r3.<init>(r4)
            r2.setAccount(r3)
            xc.d r3 = new xc.d
            java.lang.String r4 = r1.f19149b
            r3.<init>(r4)
            r2.setName(r3)
            xc.c r3 = new xc.c
            pd.t1 r4 = r1.f19150c
            java.lang.String r4 = r4.getHex()
            r3.<init>(r4)
            r2.setData(r3)
            java.util.List<one.block.eosiojava.models.rpcProvider.Authorization> r1 = r1.f19151d
            java.util.ArrayList r3 = new java.util.ArrayList
            int r4 = p062dh.C1469e.m3992D(r1, r11)
            r3.<init>(r4)
            java.util.Iterator r1 = r1.iterator()
        L7e:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L9b
            java.lang.Object r4 = r1.next()
            one.block.eosiojava.models.rpcProvider.Authorization r4 = (one.block.eosiojava.models.rpcProvider.Authorization) r4
            xc.k r5 = new xc.k
            java.lang.String r6 = r4.getActor()
            java.lang.String r4 = r4.getPermission()
            r5.<init>(r6, r4)
            r3.add(r5)
            goto L7e
        L9b:
            java.util.Iterator r1 = r3.iterator()
        L9f:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto Laf
            java.lang.Object r3 = r1.next()
            xc.k r3 = (p414xc.C7036k) r3
            r2.addAuthorization(r3)
            goto L9f
        Laf:
            r8.add(r2)
            goto L3c
        Lb3:
            xc.e r7 = new xc.e
            r7.<init>(r8)
            java.util.List r8 = r7.getActions()
            java.util.Iterator r8 = r8.iterator()
        Lc0:
            boolean r11 = r8.hasNext()
            if (r11 == 0) goto Lde
            java.lang.Object r11 = r8.next()
            xc.b r11 = (p414xc.C7027b) r11
            xc.c r1 = r11.getData()
            boolean r1 = r1.isPacked()
            if (r1 != 0) goto Lc0
            uc.e r1 = r0.f24850b
            wc.a r2 = r0.f24849a
            r1.m13019a(r2, r11)
            goto Lc0
        Lde:
            r0.f24852d = r7
            if (r9 != 0) goto Le4
            java.lang.String r9 = "taco://transfer/main/{{sa}}?tx={{tx}}&bn={{bn}}"
        Le4:
            r0.f24854f = r9
            xc.m r7 = r0.f24853e
            r7.setBroadcast(r10)
            r8 = 0
            r7.setBackground(r8)
            java.lang.String r7 = r0.m13020a()
            java.lang.String r9 = "eossignin"
            hk.a$b r9 = hk.C3053a.m7466a(r9)
            java.lang.Object[] r8 = new java.lang.Object[r8]
            r9.mo7467a(r7, r8)
            java.lang.String r8 = "esr"
            p214m2.C4339q.m9705j(r7, r8)
            return r7
    }

    /* renamed from: a */
    public void m2206a(android.os.CountDownTimer r2) {
            r1 = this;
            java.util.List<com.bumptech.glide.load.ImageHeaderParser> r0 = r1.f3814a
            r0.add(r2)
            return
    }

    /* renamed from: b */
    public p020b3.C0660b m2207b(java.util.List<p238nd.C4783w0> r2) {
            r1 = this;
            java.util.List<com.bumptech.glide.load.ImageHeaderParser> r0 = r1.f3814a
            r0.addAll(r2)
            return r1
    }

    /* renamed from: c */
    public p020b3.C0660b m2208c(p238nd.C4783w0 r2) {
            r1 = this;
            java.util.List<com.bumptech.glide.load.ImageHeaderParser> r0 = r1.f3814a
            r0.add(r2)
            return r1
    }

    /* renamed from: d */
    public p020b3.C0660b m2209d(p238nd.EnumC4724a r5, one.block.eosiojava.models.rpcProvider.Authorization r6) {
            r4 = this;
            java.util.List<com.bumptech.glide.load.ImageHeaderParser> r0 = r4.f3814a
            java.lang.String r5 = r5.name()
            java.util.Locale r1 = java.util.Locale.ENGLISH
            java.lang.String r2 = "ENGLISH"
            p214m2.C4339q.m9705j(r1, r2)
            java.lang.String r5 = r5.toLowerCase(r1)
            java.lang.String r1 = "this as java.lang.String).toLowerCase(locale)"
            p214m2.C4339q.m9705j(r5, r1)
            java.lang.String r1 = r6.getActor()
            pd.b r2 = new pd.b
            java.lang.String r3 = "actor"
            p214m2.C4339q.m9705j(r1, r3)
            r2.<init>(r1, r5)
            nd.w0 r5 = new nd.w0
            java.util.List r6 = p074e9.C1805a.m4528m(r6)
            java.lang.String r1 = "a.taco"
            java.lang.String r3 = "tacoaction"
            r5.<init>(r1, r3, r2, r6)
            r0.add(r5)
            return r4
    }

    /* renamed from: e */
    public void m2210e() {
            r2 = this;
            java.util.List<com.bumptech.glide.load.ImageHeaderParser> r0 = r2.f3814a
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L16
            java.lang.Object r1 = r0.next()
            android.os.CountDownTimer r1 = (android.os.CountDownTimer) r1
            r1.cancel()
            goto L6
        L16:
            return
    }

    /* renamed from: g */
    public java.util.List<one.block.eosiojava.models.rpcProvider.Action> m2211g() {
            r7 = this;
            java.util.List<com.bumptech.glide.load.ImageHeaderParser> r0 = r7.f3814a
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 10
            int r2 = p062dh.C1469e.m3992D(r0, r2)
            r1.<init>(r2)
            java.util.Iterator r0 = r0.iterator()
        L11:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L32
            java.lang.Object r2 = r0.next()
            nd.w0 r2 = (p238nd.C4783w0) r2
            one.block.eosiojava.models.rpcProvider.Action r3 = new one.block.eosiojava.models.rpcProvider.Action
            java.lang.String r4 = r2.f19148a
            java.lang.String r5 = r2.f19149b
            java.util.List<one.block.eosiojava.models.rpcProvider.Authorization> r6 = r2.f19151d
            pd.t1 r2 = r2.f19150c
            java.lang.String r2 = r2.getJson()
            r3.<init>(r4, r5, r6, r2)
            r1.add(r3)
            goto L11
        L32:
            return r1
    }
}
