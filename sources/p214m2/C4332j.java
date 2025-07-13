package p214m2;

/* renamed from: m2.j */
/* loaded from: classes.dex */
public class C4332j<DataType, ResourceType, Transcode> {

    /* renamed from: a */
    public final java.lang.Class<DataType> f17715a;

    /* renamed from: b */
    public final java.util.List<? extends p180k2.InterfaceC3674f<DataType, ResourceType>> f17716b;

    /* renamed from: c */
    public final p425y2.InterfaceC7105b<ResourceType, Transcode> f17717c;

    /* renamed from: d */
    public final p212m0.InterfaceC4313c<java.util.List<java.lang.Throwable>> f17718d;

    /* renamed from: e */
    public final java.lang.String f17719e;

    /* renamed from: m2.j$a */
    public interface a<ResourceType> {
    }

    public C4332j(java.lang.Class<DataType> r1, java.lang.Class<ResourceType> r2, java.lang.Class<Transcode> r3, java.util.List<? extends p180k2.InterfaceC3674f<DataType, ResourceType>> r4, p425y2.InterfaceC7105b<ResourceType, Transcode> r5, p212m0.InterfaceC4313c<java.util.List<java.lang.Throwable>> r6) {
            r0 = this;
            r0.<init>()
            r0.f17715a = r1
            r0.f17716b = r4
            r0.f17717c = r5
            r0.f17718d = r6
            java.lang.String r4 = "Failed DecodePath{"
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
            r0.f17719e = r1
            return
    }

    /* renamed from: a */
    public p214m2.InterfaceC4345w<Transcode> m9678a(com.bumptech.glide.load.data.InterfaceC1017e<DataType> r11, int r12, int r13, p180k2.C3673e r14, p214m2.C4332j.a<ResourceType> r15) {
            r10 = this;
            m0.c<java.util.List<java.lang.Throwable>> r0 = r10.f17718d
            java.lang.Object r0 = r0.mo6231b()
            java.lang.String r1 = "Argument must not be null"
            java.util.Objects.requireNonNull(r0, r1)
            java.util.List r0 = (java.util.List) r0
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            r7 = r0
            m2.w r11 = r2.m9679b(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L11e
            m0.c<java.util.List<java.lang.Throwable>> r12 = r10.f17718d
            r12.mo6230a(r0)
            m2.i$b r15 = (p214m2.RunnableC4331i.b) r15
            m2.i r12 = r15.f17697b
            com.bumptech.glide.load.a r13 = r15.f17696a
            java.util.Objects.requireNonNull(r12)
            java.lang.Object r15 = r11.get()
            java.lang.Class r7 = r15.getClass()
            com.bumptech.glide.load.a r15 = com.bumptech.glide.load.EnumC1008a.f5183b0
            r0 = 0
            if (r13 == r15) goto L45
            m2.h<R> r15 = r12.f17668Y
            k2.h r15 = r15.m9664f(r7)
            com.bumptech.glide.e r1 = r12.f17675f0
            int r2 = r12.f17679j0
            int r3 = r12.f17680k0
            m2.w r1 = r15.mo8134a(r1, r11, r2, r3)
            r6 = r15
            r15 = r1
            goto L47
        L45:
            r15 = r11
            r6 = r0
        L47:
            boolean r1 = r11.equals(r15)
            if (r1 != 0) goto L50
            r11.mo9721d()
        L50:
            m2.h<R> r11 = r12.f17668Y
            com.bumptech.glide.e r11 = r11.f17648c
            com.bumptech.glide.h r11 = r11.f5124b
            b3.e r11 = r11.f5143d
            java.lang.Class r1 = r15.mo9720c()
            k2.g r11 = r11.m2215a(r1)
            r1 = 0
            r2 = 1
            if (r11 == 0) goto L66
            r11 = 1
            goto L67
        L66:
            r11 = 0
        L67:
            if (r11 == 0) goto L8c
            m2.h<R> r11 = r12.f17668Y
            com.bumptech.glide.e r11 = r11.f17648c
            com.bumptech.glide.h r11 = r11.f5124b
            b3.e r11 = r11.f5143d
            java.lang.Class r0 = r15.mo9720c()
            k2.g r0 = r11.m2215a(r0)
            if (r0 == 0) goto L82
            k2.e r11 = r12.f17682m0
            com.bumptech.glide.load.c r11 = r0.mo827s(r11)
            goto L8e
        L82:
            com.bumptech.glide.h$d r11 = new com.bumptech.glide.h$d
            java.lang.Class r12 = r15.mo9720c()
            r11.<init>(r12)
            throw r11
        L8c:
            com.bumptech.glide.load.c r11 = com.bumptech.glide.load.EnumC1010c.f5191a0
        L8e:
            r9 = r0
            m2.h<R> r0 = r12.f17668Y
            k2.c r3 = r12.f17691v0
            java.util.List r0 = r0.m9661c()
            int r4 = r0.size()
            r5 = 0
        L9c:
            if (r5 >= r4) goto Lb1
            java.lang.Object r8 = r0.get(r5)
            q2.m$a r8 = (p282q2.InterfaceC5556m.a) r8
            k2.c r8 = r8.f21624a
            boolean r8 = r8.equals(r3)
            if (r8 == 0) goto Lae
            r1 = 1
            goto Lb1
        Lae:
            int r5 = r5 + 1
            goto L9c
        Lb1:
            r0 = r1 ^ 1
            m2.k r1 = r12.f17681l0
            boolean r13 = r1.mo9683d(r0, r13, r11)
            if (r13 == 0) goto L117
            if (r9 == 0) goto L109
            int r13 = r11.ordinal()
            if (r13 == 0) goto Lf3
            if (r13 != r2) goto Ldc
            m2.y r11 = new m2.y
            m2.h<R> r13 = r12.f17668Y
            com.bumptech.glide.e r13 = r13.f17648c
            n2.b r1 = r13.f5123a
            k2.c r2 = r12.f17691v0
            k2.c r3 = r12.f17676g0
            int r4 = r12.f17679j0
            int r5 = r12.f17680k0
            k2.e r8 = r12.f17682m0
            r0 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            goto Lfc
        Ldc:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r14 = "Unknown strategy: "
            r13.append(r14)
            r13.append(r11)
            java.lang.String r11 = r13.toString()
            r12.<init>(r11)
            throw r12
        Lf3:
            m2.e r11 = new m2.e
            k2.c r13 = r12.f17691v0
            k2.c r0 = r12.f17676g0
            r11.<init>(r13, r0)
        Lfc:
            m2.v r15 = p214m2.C4344v.m9731b(r15)
            m2.i$c<?> r12 = r12.f17673d0
            r12.f17698a = r11
            r12.f17699b = r9
            r12.f17700c = r15
            goto L117
        L109:
            com.bumptech.glide.h$d r11 = new com.bumptech.glide.h$d
            java.lang.Object r12 = r15.get()
            java.lang.Class r12 = r12.getClass()
            r11.<init>(r12)
            throw r11
        L117:
            y2.b<ResourceType, Transcode> r11 = r10.f17717c
            m2.w r11 = r11.mo1272g(r15, r14)
            return r11
        L11e:
            r11 = move-exception
            m0.c<java.util.List<java.lang.Throwable>> r12 = r10.f17718d
            r12.mo6230a(r0)
            throw r11
    }

    /* renamed from: b */
    public final p214m2.InterfaceC4345w<ResourceType> m9679b(com.bumptech.glide.load.data.InterfaceC1017e<DataType> r9, int r10, int r11, p180k2.C3673e r12, java.util.List<java.lang.Throwable> r13) {
            r8 = this;
            java.util.List<? extends k2.f<DataType, ResourceType>> r0 = r8.f17716b
            int r0 = r0.size()
            r1 = 0
            r2 = 0
        L8:
            if (r2 >= r0) goto L50
            java.util.List<? extends k2.f<DataType, ResourceType>> r3 = r8.f17716b
            java.lang.Object r3 = r3.get(r2)
            k2.f r3 = (p180k2.InterfaceC3674f) r3
            java.lang.Object r4 = r9.mo2781a()     // Catch: java.lang.OutOfMemoryError -> L25 java.lang.RuntimeException -> L27 java.io.IOException -> L29
            boolean r4 = r3.mo8133b(r4, r12)     // Catch: java.lang.OutOfMemoryError -> L25 java.lang.RuntimeException -> L27 java.io.IOException -> L29
            if (r4 == 0) goto L4a
            java.lang.Object r4 = r9.mo2781a()     // Catch: java.lang.OutOfMemoryError -> L25 java.lang.RuntimeException -> L27 java.io.IOException -> L29
            m2.w r1 = r3.mo8132a(r4, r10, r11, r12)     // Catch: java.lang.OutOfMemoryError -> L25 java.lang.RuntimeException -> L27 java.io.IOException -> L29
            goto L4a
        L25:
            r4 = move-exception
            goto L2a
        L27:
            r4 = move-exception
            goto L2a
        L29:
            r4 = move-exception
        L2a:
            r5 = 2
            java.lang.String r6 = "DecodePath"
            boolean r5 = android.util.Log.isLoggable(r6, r5)
            if (r5 == 0) goto L47
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r7 = "Failed to decode data for "
            r5.append(r7)
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            android.util.Log.v(r6, r3, r4)
        L47:
            r13.add(r4)
        L4a:
            if (r1 == 0) goto L4d
            goto L50
        L4d:
            int r2 = r2 + 1
            goto L8
        L50:
            if (r1 == 0) goto L53
            return r1
        L53:
            m2.s r9 = new m2.s
            java.lang.String r10 = r8.f17719e
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>(r13)
            r9.<init>(r10, r11)
            throw r9
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = "DecodePath{ dataClass="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.lang.Class<DataType> r1 = r2.f17715a
            r0.append(r1)
            java.lang.String r1 = ", decoders="
            r0.append(r1)
            java.util.List<? extends k2.f<DataType, ResourceType>> r1 = r2.f17716b
            r0.append(r1)
            java.lang.String r1 = ", transcoder="
            r0.append(r1)
            y2.b<ResourceType, Transcode> r1 = r2.f17717c
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
