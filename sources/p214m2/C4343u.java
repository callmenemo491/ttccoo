package p214m2;

/* renamed from: m2.u */
/* loaded from: classes.dex */
public class C4343u<Data, ResourceType, Transcode> {

    /* renamed from: a */
    public final p212m0.InterfaceC4313c<java.util.List<java.lang.Throwable>> f17807a;

    /* renamed from: b */
    public final java.util.List<? extends p214m2.C4332j<Data, ResourceType, Transcode>> f17808b;

    /* renamed from: c */
    public final java.lang.String f17809c;

    public C4343u(java.lang.Class<Data> r1, java.lang.Class<ResourceType> r2, java.lang.Class<Transcode> r3, java.util.List<p214m2.C4332j<Data, ResourceType, Transcode>> r4, p212m0.InterfaceC4313c<java.util.List<java.lang.Throwable>> r5) {
            r0 = this;
            r0.<init>()
            r0.f17807a = r5
            boolean r5 = r4.isEmpty()
            if (r5 != 0) goto L3c
            r0.f17808b = r4
            java.lang.String r4 = "Failed LoadPath{"
            java.lang.StringBuilder r4 = android.support.v4.media.C0144c.m256a(r4)
            java.lang.String r1 = r1.getSimpleName()
            r4.append(r1)
            java.lang.String r1 = "->"
            r4.append(r1)
            java.lang.String r2 = r2.getSimpleName()
            r4.append(r2)
            r4.append(r1)
            java.lang.String r1 = r3.getSimpleName()
            r4.append(r1)
            java.lang.String r1 = "}"
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            r0.f17809c = r1
            return
        L3c:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Must not be empty."
            r1.<init>(r2)
            throw r1
    }

    /* renamed from: a */
    public p214m2.InterfaceC4345w<Transcode> m9730a(com.bumptech.glide.load.data.InterfaceC1017e<Data> r13, p180k2.C3673e r14, int r15, int r16, p214m2.C4332j.a<ResourceType> r17) {
            r12 = this;
            r1 = r12
            m0.c<java.util.List<java.lang.Throwable>> r0 = r1.f17807a
            java.lang.Object r0 = r0.mo6231b()
            java.lang.String r2 = "Argument must not be null"
            java.util.Objects.requireNonNull(r0, r2)
            r2 = r0
            java.util.List r2 = (java.util.List) r2
            java.util.List<? extends m2.j<Data, ResourceType, Transcode>> r0 = r1.f17808b     // Catch: java.lang.Throwable -> L51
            int r3 = r0.size()     // Catch: java.lang.Throwable -> L51
            r0 = 0
            r4 = 0
            r4 = r0
            r5 = 0
        L19:
            if (r5 >= r3) goto L3c
            java.util.List<? extends m2.j<Data, ResourceType, Transcode>> r0 = r1.f17808b     // Catch: java.lang.Throwable -> L51
            java.lang.Object r0 = r0.get(r5)     // Catch: java.lang.Throwable -> L51
            r6 = r0
            m2.j r6 = (p214m2.C4332j) r6     // Catch: java.lang.Throwable -> L51
            r7 = r13
            r8 = r15
            r9 = r16
            r10 = r14
            r11 = r17
            m2.w r0 = r6.m9678a(r7, r8, r9, r10, r11)     // Catch: p214m2.C4341s -> L31 java.lang.Throwable -> L51
            r4 = r0
            goto L36
        L31:
            r0 = move-exception
            r6 = r0
            r2.add(r6)     // Catch: java.lang.Throwable -> L51
        L36:
            if (r4 == 0) goto L39
            goto L3c
        L39:
            int r5 = r5 + 1
            goto L19
        L3c:
            if (r4 == 0) goto L44
            m0.c<java.util.List<java.lang.Throwable>> r0 = r1.f17807a
            r0.mo6230a(r2)
            return r4
        L44:
            m2.s r0 = new m2.s     // Catch: java.lang.Throwable -> L51
            java.lang.String r3 = r1.f17809c     // Catch: java.lang.Throwable -> L51
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L51
            r4.<init>(r2)     // Catch: java.lang.Throwable -> L51
            r0.<init>(r3, r4)     // Catch: java.lang.Throwable -> L51
            throw r0     // Catch: java.lang.Throwable -> L51
        L51:
            r0 = move-exception
            m0.c<java.util.List<java.lang.Throwable>> r3 = r1.f17807a
            r3.mo6230a(r2)
            throw r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = "LoadPath{decodePaths="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.util.List<? extends m2.j<Data, ResourceType, Transcode>> r1 = r2.f17808b
            java.lang.Object[] r1 = r1.toArray()
            java.lang.String r1 = java.util.Arrays.toString(r1)
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
