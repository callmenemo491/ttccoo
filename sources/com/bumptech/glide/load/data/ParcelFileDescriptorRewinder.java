package com.bumptech.glide.load.data;

/* loaded from: classes.dex */
public final class ParcelFileDescriptorRewinder implements com.bumptech.glide.load.data.InterfaceC1017e<android.os.ParcelFileDescriptor> {

    /* renamed from: a */
    public final com.bumptech.glide.load.data.ParcelFileDescriptorRewinder.InternalRewinder f5193a;

    public static final class InternalRewinder {

        /* renamed from: a */
        public final android.os.ParcelFileDescriptor f5194a;

        public InternalRewinder(android.os.ParcelFileDescriptor r1) {
                r0 = this;
                r0.<init>()
                r0.f5194a = r1
                return
        }

        public android.os.ParcelFileDescriptor rewind() {
                r4 = this;
                android.os.ParcelFileDescriptor r0 = r4.f5194a     // Catch: android.system.ErrnoException -> L10
                java.io.FileDescriptor r0 = r0.getFileDescriptor()     // Catch: android.system.ErrnoException -> L10
                r1 = 0
                int r3 = android.system.OsConstants.SEEK_SET     // Catch: android.system.ErrnoException -> L10
                android.system.Os.lseek(r0, r1, r3)     // Catch: android.system.ErrnoException -> L10
                android.os.ParcelFileDescriptor r0 = r4.f5194a
                return r0
            L10:
                r0 = move-exception
                java.io.IOException r1 = new java.io.IOException
                r1.<init>(r0)
                throw r1
        }
    }

    /* renamed from: com.bumptech.glide.load.data.ParcelFileDescriptorRewinder$a */
    public static final class C1012a implements com.bumptech.glide.load.data.InterfaceC1017e.a<android.os.ParcelFileDescriptor> {
        public C1012a() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.bumptech.glide.load.data.InterfaceC1017e.a
        /* renamed from: a */
        public java.lang.Class<android.os.ParcelFileDescriptor> mo2784a() {
                r1 = this;
                java.lang.Class<android.os.ParcelFileDescriptor> r0 = android.os.ParcelFileDescriptor.class
                return r0
        }

        @Override // com.bumptech.glide.load.data.InterfaceC1017e.a
        /* renamed from: b */
        public com.bumptech.glide.load.data.InterfaceC1017e<android.os.ParcelFileDescriptor> mo2785b(android.os.ParcelFileDescriptor r2) {
                r1 = this;
                android.os.ParcelFileDescriptor r2 = (android.os.ParcelFileDescriptor) r2
                com.bumptech.glide.load.data.ParcelFileDescriptorRewinder r0 = new com.bumptech.glide.load.data.ParcelFileDescriptorRewinder
                r0.<init>(r2)
                return r0
        }
    }

    public ParcelFileDescriptorRewinder(android.os.ParcelFileDescriptor r2) {
            r1 = this;
            r1.<init>()
            com.bumptech.glide.load.data.ParcelFileDescriptorRewinder$InternalRewinder r0 = new com.bumptech.glide.load.data.ParcelFileDescriptorRewinder$InternalRewinder
            r0.<init>(r2)
            r1.f5193a = r0
            return
    }

    @Override // com.bumptech.glide.load.data.InterfaceC1017e
    /* renamed from: a */
    public /* bridge */ /* synthetic */ android.os.ParcelFileDescriptor mo2781a() {
            r1 = this;
            android.os.ParcelFileDescriptor r0 = r1.m2783c()
            return r0
    }

    @Override // com.bumptech.glide.load.data.InterfaceC1017e
    /* renamed from: b */
    public void mo2782b() {
            r0 = this;
            return
    }

    /* renamed from: c */
    public android.os.ParcelFileDescriptor m2783c() {
            r1 = this;
            com.bumptech.glide.load.data.ParcelFileDescriptorRewinder$InternalRewinder r0 = r1.f5193a
            android.os.ParcelFileDescriptor r0 = r0.rewind()
            return r0
    }
}
