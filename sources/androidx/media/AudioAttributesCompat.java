package androidx.media;

/* loaded from: classes.dex */
public class AudioAttributesCompat implements p367v1.InterfaceC6491e {

    /* renamed from: b */
    public static final /* synthetic */ int f2575b = 0;

    /* renamed from: a */
    public androidx.media.AudioAttributesImpl f2576a;

    static {
            android.util.SparseIntArray r0 = new android.util.SparseIntArray
            r0.<init>()
            r1 = 5
            r2 = 1
            r0.put(r1, r2)
            r1 = 6
            r3 = 2
            r0.put(r1, r3)
            r1 = 7
            r0.put(r1, r3)
            r1 = 8
            r0.put(r1, r2)
            r1 = 9
            r0.put(r1, r2)
            r1 = 10
            r0.put(r1, r2)
            return
    }

    public AudioAttributesCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    public boolean equals(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof androidx.media.AudioAttributesCompat
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            androidx.media.AudioAttributesCompat r3 = (androidx.media.AudioAttributesCompat) r3
            androidx.media.AudioAttributesImpl r0 = r2.f2576a
            androidx.media.AudioAttributesImpl r3 = r3.f2576a
            if (r0 != 0) goto L12
            if (r3 != 0) goto L11
            r1 = 1
        L11:
            return r1
        L12:
            boolean r3 = r0.equals(r3)
            return r3
    }

    public int hashCode() {
            r1 = this;
            androidx.media.AudioAttributesImpl r0 = r1.f2576a
            int r0 = r0.hashCode()
            return r0
    }

    public java.lang.String toString() {
            r1 = this;
            androidx.media.AudioAttributesImpl r0 = r1.f2576a
            java.lang.String r0 = r0.toString()
            return r0
    }
}
