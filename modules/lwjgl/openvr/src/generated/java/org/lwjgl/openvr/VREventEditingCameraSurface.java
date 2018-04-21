/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openvr;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct VREvent_EditingCameraSurface_t {
 *     uint64_t overlayHandle;
 *     uint32_t nVisualMode;
 * }</pre></code>
 */
@NativeType("struct VREvent_EditingCameraSurface_t")
public class VREventEditingCameraSurface extends Struct {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        OVERLAYHANDLE,
        NVISUALMODE;

    static {
        Layout layout = __struct(
            __member(8),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        OVERLAYHANDLE = layout.offsetof(0);
        NVISUALMODE = layout.offsetof(1);
    }

    VREventEditingCameraSurface(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link VREventEditingCameraSurface} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VREventEditingCameraSurface(ByteBuffer container) {
        this(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code overlayHandle} field. */
    @NativeType("uint64_t")
    public long overlayHandle() { return noverlayHandle(address()); }
    /** Returns the value of the {@code nVisualMode} field. */
    @NativeType("uint32_t")
    public int nVisualMode() { return nnVisualMode(address()); }

    // -----------------------------------

    /** Returns a new {@link VREventEditingCameraSurface} instance for the specified memory address. */
    public static VREventEditingCameraSurface create(long address) {
        return new VREventEditingCameraSurface(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VREventEditingCameraSurface createSafe(long address) {
        return address == NULL ? null : create(address);
    }

    /**
     * Create a {@link VREventEditingCameraSurface.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VREventEditingCameraSurface.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VREventEditingCameraSurface.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : create(address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #overlayHandle}. */
    public static long noverlayHandle(long struct) { return memGetLong(struct + VREventEditingCameraSurface.OVERLAYHANDLE); }
    /** Unsafe version of {@link #nVisualMode}. */
    public static int nnVisualMode(long struct) { return memGetInt(struct + VREventEditingCameraSurface.NVISUALMODE); }

    // -----------------------------------

    /** An array of {@link VREventEditingCameraSurface} structs. */
    public static class Buffer extends StructBuffer<VREventEditingCameraSurface, Buffer> {

        /**
         * Creates a new {@link VREventEditingCameraSurface.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VREventEditingCameraSurface#SIZEOF}, and its mark will be undefined.
         *
         * <p>The created buffer instance holds a strong reference to the container object.</p>
         */
        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SIZEOF);
        }

        public Buffer(long address, int cap) {
            super(address, null, -1, 0, cap, cap);
        }

        Buffer(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            super(address, container, mark, pos, lim, cap);
        }

        @Override
        protected Buffer self() {
            return this;
        }

        @Override
        protected Buffer newBufferInstance(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            return new Buffer(address, container, mark, pos, lim, cap);
        }

        @Override
        protected VREventEditingCameraSurface newInstance(long address) {
            return new VREventEditingCameraSurface(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code overlayHandle} field. */
        @NativeType("uint64_t")
        public long overlayHandle() { return VREventEditingCameraSurface.noverlayHandle(address()); }
        /** Returns the value of the {@code nVisualMode} field. */
        @NativeType("uint32_t")
        public int nVisualMode() { return VREventEditingCameraSurface.nnVisualMode(address()); }

    }

}