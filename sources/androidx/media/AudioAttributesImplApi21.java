package androidx.media;

/* loaded from: classes.dex */
public class AudioAttributesImplApi21 implements androidx.media.AudioAttributesImpl {

    /* renamed from: a */
    public android.media.AudioAttributes f2577a;

    /* renamed from: b */
    public int f2578b;

    public AudioAttributesImplApi21() {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.f2578b = r0
            return
    }

    public boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof androidx.media.AudioAttributesImplApi21
            if (r0 != 0) goto L6
            r2 = 0
            return r2
        L6:
            androidx.media.AudioAttributesImplApi21 r2 = (androidx.media.AudioAttributesImplApi21) r2
            android.media.AudioAttributes r0 = r1.f2577a
            android.media.AudioAttributes r2 = r2.f2577a
            boolean r2 = r0.equals(r2)
            return r2
    }

    public int hashCode() {
            r1 = this;
            android.media.AudioAttributes r0 = r1.f2577a
            int r0 = r0.hashCode()
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = "AudioAttributesCompat: audioattributes="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            android.media.AudioAttributes r1 = r2.f2577a
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
