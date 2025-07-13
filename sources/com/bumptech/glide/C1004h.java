package com.bumptech.glide;

/* renamed from: com.bumptech.glide.h */
/* loaded from: classes.dex */
public class C1004h {

    /* renamed from: a */
    public final p282q2.C5558o f5140a;

    /* renamed from: b */
    public final p020b3.C0659a f5141b;

    /* renamed from: c */
    public final p020b3.C0662d f5142c;

    /* renamed from: d */
    public final p020b3.C0663e f5143d;

    /* renamed from: e */
    public final com.bumptech.glide.load.data.C1018f f5144e;

    /* renamed from: f */
    public final p425y2.C7106c f5145f;

    /* renamed from: g */
    public final p020b3.C0660b f5146g;

    /* renamed from: h */
    public final androidx.appcompat.widget.C0311x f5147h;

    /* renamed from: i */
    public final p020b3.C0661c f5148i;

    /* renamed from: j */
    public final p212m0.InterfaceC4313c<java.util.List<java.lang.Throwable>> f5149j;

    /* renamed from: com.bumptech.glide.h$a */
    public static class a extends java.lang.RuntimeException {
        public a(java.lang.String r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }
    }

    /* renamed from: com.bumptech.glide.h$b */
    public static final class b extends com.bumptech.glide.C1004h.a {
        public b() {
                r1 = this;
                java.lang.String r0 = "Failed to find image header parser."
                r1.<init>(r0)
                return
        }
    }

    /* renamed from: com.bumptech.glide.h$c */
    public static class c extends com.bumptech.glide.C1004h.a {
        public c(java.lang.Class<?> r3, java.lang.Class<?> r4) {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Failed to find any ModelLoaders for model: "
                r0.append(r1)
                r0.append(r3)
                java.lang.String r3 = " and data: "
                r0.append(r3)
                r0.append(r4)
                java.lang.String r3 = r0.toString()
                r2.<init>(r3)
                return
        }

        public c(java.lang.Object r2) {
                r1 = this;
                java.lang.String r0 = "Failed to find any ModelLoaders registered for model class: "
                java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
                java.lang.Class r2 = r2.getClass()
                r0.append(r2)
                java.lang.String r2 = r0.toString()
                r1.<init>(r2)
                return
        }

        public <M> c(M r3, java.util.List<p282q2.InterfaceC5556m<M, ?>> r4) {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Found ModelLoaders for model class: "
                r0.append(r1)
                r0.append(r4)
                java.lang.String r4 = ", but none that handle this specific model instance: "
                r0.append(r4)
                r0.append(r3)
                java.lang.String r3 = r0.toString()
                r2.<init>(r3)
                return
        }
    }

    /* renamed from: com.bumptech.glide.h$d */
    public static class d extends com.bumptech.glide.C1004h.a {
        public d(java.lang.Class<?> r3) {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Failed to find result encoder for resource class: "
                r0.append(r1)
                r0.append(r3)
                java.lang.String r3 = ", you may need to consider registering a new Encoder for the requested type or DiskCacheStrategy.DATA/DiskCacheStrategy.NONE if caching your transformed resource is unnecessary."
                r0.append(r3)
                java.lang.String r3 = r0.toString()
                r2.<init>(r3)
                return
        }
    }

    /* renamed from: com.bumptech.glide.h$e */
    public static class e extends com.bumptech.glide.C1004h.a {
        public e(java.lang.Class<?> r3) {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Failed to find source encoder for data class: "
                r0.append(r1)
                r0.append(r3)
                java.lang.String r3 = r0.toString()
                r2.<init>(r3)
                return
        }
    }

    public C1004h() {
            r6 = this;
            r6.<init>()
            androidx.appcompat.widget.x r0 = new androidx.appcompat.widget.x
            r1 = 5
            r0.<init>(r1)
            r6.f5147h = r0
            b3.c r0 = new b3.c
            r0.<init>()
            r6.f5148i = r0
            m0.d r0 = new m0.d
            r1 = 20
            r0.<init>(r1)
            h3.b r1 = new h3.b
            r1.<init>()
            h3.c r2 = new h3.c
            r2.<init>()
            h3.a$c r3 = new h3.a$c
            r3.<init>(r0, r1, r2)
            r6.f5149j = r3
            q2.o r0 = new q2.o
            r0.<init>(r3)
            r6.f5140a = r0
            b3.a r0 = new b3.a
            r0.<init>()
            r6.f5141b = r0
            b3.d r0 = new b3.d
            r0.<init>()
            r6.f5142c = r0
            b3.e r0 = new b3.e
            r0.<init>()
            r6.f5143d = r0
            com.bumptech.glide.load.data.f r0 = new com.bumptech.glide.load.data.f
            r0.<init>()
            r6.f5144e = r0
            y2.c r0 = new y2.c
            r0.<init>()
            r6.f5145f = r0
            b3.b r0 = new b3.b
            r1 = 0
            r0.<init>(r1)
            r6.f5146g = r0
            java.lang.String r0 = "Gif"
            java.lang.String r1 = "Bitmap"
            java.lang.String r2 = "BitmapDrawable"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1, r2}
            java.util.List r0 = java.util.Arrays.asList(r0)
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r0.size()
            r1.<init>(r2)
            java.lang.String r2 = "legacy_prepend_all"
            r1.add(r2)
            java.util.Iterator r0 = r0.iterator()
        L7c:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L8c
            java.lang.Object r2 = r0.next()
            java.lang.String r2 = (java.lang.String) r2
            r1.add(r2)
            goto L7c
        L8c:
            java.lang.String r0 = "legacy_append"
            r1.add(r0)
            b3.d r0 = r6.f5142c
            monitor-enter(r0)
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Ld4
            java.util.List<java.lang.String> r3 = r0.f3818a     // Catch: java.lang.Throwable -> Ld4
            r2.<init>(r3)     // Catch: java.lang.Throwable -> Ld4
            java.util.List<java.lang.String> r3 = r0.f3818a     // Catch: java.lang.Throwable -> Ld4
            r3.clear()     // Catch: java.lang.Throwable -> Ld4
            java.util.Iterator r3 = r1.iterator()     // Catch: java.lang.Throwable -> Ld4
        La4:
            boolean r4 = r3.hasNext()     // Catch: java.lang.Throwable -> Ld4
            if (r4 == 0) goto Lb6
            java.lang.Object r4 = r3.next()     // Catch: java.lang.Throwable -> Ld4
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> Ld4
            java.util.List<java.lang.String> r5 = r0.f3818a     // Catch: java.lang.Throwable -> Ld4
            r5.add(r4)     // Catch: java.lang.Throwable -> Ld4
            goto La4
        Lb6:
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> Ld4
        Lba:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> Ld4
            if (r3 == 0) goto Ld2
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> Ld4
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> Ld4
            boolean r4 = r1.contains(r3)     // Catch: java.lang.Throwable -> Ld4
            if (r4 != 0) goto Lba
            java.util.List<java.lang.String> r4 = r0.f3818a     // Catch: java.lang.Throwable -> Ld4
            r4.add(r3)     // Catch: java.lang.Throwable -> Ld4
            goto Lba
        Ld2:
            monitor-exit(r0)
            return
        Ld4:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    /* renamed from: a */
    public <Model, Data> com.bumptech.glide.C1004h m2739a(java.lang.Class<Model> r4, java.lang.Class<Data> r5, p282q2.InterfaceC5557n<Model, Data> r6) {
            r3 = this;
            q2.o r0 = r3.f5140a
            monitor-enter(r0)
            q2.q r1 = r0.f21627a     // Catch: java.lang.Throwable -> L21
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L21
            q2.q$b r2 = new q2.q$b     // Catch: java.lang.Throwable -> L1e
            r2.<init>(r4, r5, r6)     // Catch: java.lang.Throwable -> L1e
            java.util.List<q2.q$b<?, ?>> r4 = r1.f21642a     // Catch: java.lang.Throwable -> L1e
            int r5 = r4.size()     // Catch: java.lang.Throwable -> L1e
            r4.add(r5, r2)     // Catch: java.lang.Throwable -> L1e
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L21
            q2.o$a r4 = r0.f21628b     // Catch: java.lang.Throwable -> L21
            java.util.Map<java.lang.Class<?>, q2.o$a$a<?>> r4 = r4.f21629a     // Catch: java.lang.Throwable -> L21
            r4.clear()     // Catch: java.lang.Throwable -> L21
            monitor-exit(r0)
            return r3
        L1e:
            r4 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L21
            throw r4     // Catch: java.lang.Throwable -> L21
        L21:
            r4 = move-exception
            monitor-exit(r0)
            throw r4
    }

    /* renamed from: b */
    public <Data> com.bumptech.glide.C1004h m2740b(java.lang.Class<Data> r4, p180k2.InterfaceC3669a<Data> r5) {
            r3 = this;
            b3.a r0 = r3.f5141b
            monitor-enter(r0)
            java.util.List<b3.a$a<?>> r1 = r0.f3811a     // Catch: java.lang.Throwable -> Lf
            b3.a$a r2 = new b3.a$a     // Catch: java.lang.Throwable -> Lf
            r2.<init>(r4, r5)     // Catch: java.lang.Throwable -> Lf
            r1.add(r2)     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r0)
            return r3
        Lf:
            r4 = move-exception
            monitor-exit(r0)
            throw r4
    }

    /* renamed from: c */
    public <TResource> com.bumptech.glide.C1004h m2741c(java.lang.Class<TResource> r4, p180k2.InterfaceC3675g<TResource> r5) {
            r3 = this;
            b3.e r0 = r3.f5143d
            monitor-enter(r0)
            java.util.List<b3.e$a<?>> r1 = r0.f3823a     // Catch: java.lang.Throwable -> Lf
            b3.e$a r2 = new b3.e$a     // Catch: java.lang.Throwable -> Lf
            r2.<init>(r4, r5)     // Catch: java.lang.Throwable -> Lf
            r1.add(r2)     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r0)
            return r3
        Lf:
            r4 = move-exception
            monitor-exit(r0)
            throw r4
    }

    /* renamed from: d */
    public <Data, TResource> com.bumptech.glide.C1004h m2742d(java.lang.String r3, java.lang.Class<Data> r4, java.lang.Class<TResource> r5, p180k2.InterfaceC3674f<Data, TResource> r6) {
            r2 = this;
            b3.d r0 = r2.f5142c
            monitor-enter(r0)
            java.util.List r3 = r0.m2212a(r3)     // Catch: java.lang.Throwable -> L11
            b3.d$a r1 = new b3.d$a     // Catch: java.lang.Throwable -> L11
            r1.<init>(r4, r5, r6)     // Catch: java.lang.Throwable -> L11
            r3.add(r1)     // Catch: java.lang.Throwable -> L11
            monitor-exit(r0)
            return r2
        L11:
            r3 = move-exception
            monitor-exit(r0)
            throw r3
    }

    /* renamed from: e */
    public java.util.List<com.bumptech.glide.load.ImageHeaderParser> m2743e() {
            r2 = this;
            b3.b r0 = r2.f5146g
            monitor-enter(r0)
            java.util.List<com.bumptech.glide.load.ImageHeaderParser> r1 = r0.f3814a     // Catch: java.lang.Throwable -> L13
            monitor-exit(r0)
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto Ld
            return r1
        Ld:
            com.bumptech.glide.h$b r0 = new com.bumptech.glide.h$b
            r0.<init>()
            throw r0
        L13:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    /* renamed from: f */
    public <Model> java.util.List<p282q2.InterfaceC5556m<Model, ?>> m2744f(Model r9) {
            r8 = this;
            q2.o r0 = r8.f5140a
            java.util.Objects.requireNonNull(r0)
            java.lang.Class r1 = r9.getClass()
            monitor-enter(r0)
            q2.o$a r2 = r0.f21628b     // Catch: java.lang.Throwable -> L92
            java.util.Map<java.lang.Class<?>, q2.o$a$a<?>> r2 = r2.f21629a     // Catch: java.lang.Throwable -> L92
            java.lang.Object r2 = r2.get(r1)     // Catch: java.lang.Throwable -> L92
            q2.o$a$a r2 = (p282q2.C5558o.a.C7417a) r2     // Catch: java.lang.Throwable -> L92
            if (r2 != 0) goto L18
            r2 = 0
            goto L1a
        L18:
            java.util.List<q2.m<Model, ?>> r2 = r2.f21630a     // Catch: java.lang.Throwable -> L92
        L1a:
            if (r2 != 0) goto L4f
            q2.q r2 = r0.f21627a     // Catch: java.lang.Throwable -> L92
            java.util.List r2 = r2.m11840a(r1)     // Catch: java.lang.Throwable -> L92
            java.util.List r2 = java.util.Collections.unmodifiableList(r2)     // Catch: java.lang.Throwable -> L92
            q2.o$a r3 = r0.f21628b     // Catch: java.lang.Throwable -> L92
            java.util.Map<java.lang.Class<?>, q2.o$a$a<?>> r3 = r3.f21629a     // Catch: java.lang.Throwable -> L92
            q2.o$a$a r4 = new q2.o$a$a     // Catch: java.lang.Throwable -> L92
            r4.<init>(r2)     // Catch: java.lang.Throwable -> L92
            java.lang.Object r3 = r3.put(r1, r4)     // Catch: java.lang.Throwable -> L92
            q2.o$a$a r3 = (p282q2.C5558o.a.C7417a) r3     // Catch: java.lang.Throwable -> L92
            if (r3 != 0) goto L38
            goto L4f
        L38:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L92
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L92
            r2.<init>()     // Catch: java.lang.Throwable -> L92
            java.lang.String r3 = "Already cached loaders for model: "
            r2.append(r3)     // Catch: java.lang.Throwable -> L92
            r2.append(r1)     // Catch: java.lang.Throwable -> L92
            java.lang.String r1 = r2.toString()     // Catch: java.lang.Throwable -> L92
            r9.<init>(r1)     // Catch: java.lang.Throwable -> L92
            throw r9     // Catch: java.lang.Throwable -> L92
        L4f:
            monitor-exit(r0)
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L8c
            int r0 = r2.size()
            java.util.List r1 = java.util.Collections.emptyList()
            r3 = 0
            r4 = 1
            r5 = 0
        L61:
            if (r5 >= r0) goto L7f
            java.lang.Object r6 = r2.get(r5)
            q2.m r6 = (p282q2.InterfaceC5556m) r6
            boolean r7 = r6.mo9583b(r9)
            if (r7 == 0) goto L7c
            if (r4 == 0) goto L79
            java.util.ArrayList r1 = new java.util.ArrayList
            int r4 = r0 - r5
            r1.<init>(r4)
            r4 = 0
        L79:
            r1.add(r6)
        L7c:
            int r5 = r5 + 1
            goto L61
        L7f:
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L86
            return r1
        L86:
            com.bumptech.glide.h$c r0 = new com.bumptech.glide.h$c
            r0.<init>(r9, r2)
            throw r0
        L8c:
            com.bumptech.glide.h$c r0 = new com.bumptech.glide.h$c
            r0.<init>(r9)
            throw r0
        L92:
            r9 = move-exception
            monitor-exit(r0)
            throw r9
    }

    /* renamed from: g */
    public com.bumptech.glide.C1004h m2745g(com.bumptech.glide.load.data.InterfaceC1017e.a<?> r4) {
            r3 = this;
            com.bumptech.glide.load.data.f r0 = r3.f5144e
            monitor-enter(r0)
            java.util.Map<java.lang.Class<?>, com.bumptech.glide.load.data.e$a<?>> r1 = r0.f5203a     // Catch: java.lang.Throwable -> Le
            java.lang.Class r2 = r4.mo2784a()     // Catch: java.lang.Throwable -> Le
            r1.put(r2, r4)     // Catch: java.lang.Throwable -> Le
            monitor-exit(r0)
            return r3
        Le:
            r4 = move-exception
            monitor-exit(r0)
            throw r4
    }

    /* renamed from: h */
    public <TResource, Transcode> com.bumptech.glide.C1004h m2746h(java.lang.Class<TResource> r4, java.lang.Class<Transcode> r5, p425y2.InterfaceC7105b<TResource, Transcode> r6) {
            r3 = this;
            y2.c r0 = r3.f5145f
            monitor-enter(r0)
            java.util.List<y2.c$a<?, ?>> r1 = r0.f27497a     // Catch: java.lang.Throwable -> Lf
            y2.c$a r2 = new y2.c$a     // Catch: java.lang.Throwable -> Lf
            r2.<init>(r4, r5, r6)     // Catch: java.lang.Throwable -> Lf
            r1.add(r2)     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r0)
            return r3
        Lf:
            r4 = move-exception
            monitor-exit(r0)
            throw r4
    }
}
